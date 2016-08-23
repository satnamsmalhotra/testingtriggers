package com.codiscope.jaks.triggers.java.apache.filenameutils;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import tests.sources.PrivateSource;

/**
 * Created by ronn on 19.08.16.
 */
public class TriggerNullByteInjection {

    private PrivateSource privateSource = new PrivateSource();

    private ServletFileUpload fileUpload = new ServletFileUpload();

    public void positiveTest1() {

        final String source = privateSource.method1();

        FilenameUtils.normalize(source);
        FilenameUtils.getExtension(source);
        FilenameUtils.isExtension(source, source);
        FilenameUtils.getName(source);
        FilenameUtils.getBaseName(source);
    }

    public void positiveTest2() {

        final String source = getInvalidFileName();

        FilenameUtils.normalize(source);
        FilenameUtils.getExtension(source);
        FilenameUtils.isExtension(source, source);
        FilenameUtils.getName(source);
        FilenameUtils.getBaseName(source);
    }

    private String getInvalidFileName() {
        return new String(createInvalidFileName());
    }

    private char[] createInvalidFileName() {
        return new char[] {'1', '2', 0, '3'};
    }

    public void negativeTest() {

        final String name = getFileName();

        FilenameUtils.normalize(name);
        FilenameUtils.getExtension(name);
        FilenameUtils.isExtension(name, name);
        FilenameUtils.getName(name);
        FilenameUtils.getBaseName(name);
    }

    private String getFileName() {
        return "get file name";
    }
}
