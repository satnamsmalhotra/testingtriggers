package com.codiscope.jaks.triggers.java.apache.filenameutils;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import java.util.List;

import tests.sources.PrivateSource;

/**
 * Created by ronn on 19.08.16.
 */
public class TriggerNullByteInjection {

    private PrivateSource privateSource = new PrivateSource();

    private ServletFileUpload fileUpload = new ServletFileUpload();

    public void positiveTest() {

        final String source = privateSource.method1();

        FilenameUtils.normalize(source);
        FilenameUtils.getExtension(source);
        FilenameUtils.isExtension(source, source);
        FilenameUtils.getName(source);
        FilenameUtils.getBaseName(source);
    }

    public void negativeTest() {

        final List<FileItem> source;
        try {
            source = fileUpload.parseRequest(privateSource.getRequest());
        } catch (FileUploadException e) {
            throw new RuntimeException(e);
        }

        for (final FileItem fileItem : source) {

            final String name = fileItem.getName();

            FilenameUtils.normalize(name);
            FilenameUtils.getExtension(name);
            FilenameUtils.isExtension(name, name);
            FilenameUtils.getName(name);
            FilenameUtils.getBaseName(name);
        }
    }
}
