package com.codiscope.jaks.triggers.java.apache.filenameutils;

import org.apache.commons.io.FilenameUtils;

import tests.sources.PrivateSource;

/**
 * Created by ronn on 19.08.16.
 */
public class FilenameUtilsNPEInjectionTrigger {

    private PrivateSource privateSource = new PrivateSource();

    public void callWithNull() {

        final String source = privateSource.method1();

        FilenameUtils.normalize(source);
        FilenameUtils.getExtension(source);
        FilenameUtils.isExtension(source, source);
        FilenameUtils.getName(source);
        FilenameUtils.getBaseName(source);
    }

    public void callWithNull2() {

        PrivateSource privateSource = new PrivateSource();
        final String source = privateSource.method1();

        FilenameUtils.normalize(source);
        FilenameUtils.getExtension(source);
        FilenameUtils.isExtension(source, source);
        FilenameUtils.getName(source);
        FilenameUtils.getBaseName(source);
    }
}
