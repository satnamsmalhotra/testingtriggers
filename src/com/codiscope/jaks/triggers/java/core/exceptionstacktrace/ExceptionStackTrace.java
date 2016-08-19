package com.codiscope.jaks.triggers.java.core.exceptionstacktrace;

import tests.sources.PrivateSource;

/**
 * Created by ronn on 19.08.16.
 */
public class ExceptionStackTrace {

    private PrivateSource privateSource = new PrivateSource();

    public void positiveTest() {

        try {
            throw new RuntimeException();
        } catch (final RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void negativeTest() {
        try {
            throw new RuntimeException();
        } catch (final RuntimeException e) {
            e.printStackTrace();
        }
    }
}
