package com.codiscope.jaks.triggers.java.apache.filenameutils;

import org.apache.commons.io.FilenameUtils;

/**
 * Created by ronn on 19.08.16.
 */
public class FilenameUtilsNPEInjectionTrigger {

    public static void apply(final String file) {
        FilenameUtils.normalize(file);
        FilenameUtils.getExtension(file);
        FilenameUtils.isExtension(file, file);
        FilenameUtils.getName(file);
        FilenameUtils.getBaseName(file);
    }

    public static void callWithNull() {
        apply(null);
    }
}
