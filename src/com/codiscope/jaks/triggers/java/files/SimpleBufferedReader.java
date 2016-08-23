package com.codiscope.jaks.triggers.java.files;

import tests.sources.PrivateSource;

import java.io.BufferedReader;
import java.io.IOException;

public class SimpleBufferedReader {


    public void positiveTest() throws IOException {

        BufferedReader reader = getBufferedReader();
        reader.readLine();
    }


    public void negativeTest() throws IOException {

        BufferedReader reader = getBufferedReader();
        reader.read();
    }

    private BufferedReader getBufferedReader(){
        return  null;
    }

}
