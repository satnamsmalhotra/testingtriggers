package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class PaddingOracle {

    public void positiveTest() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    }

    public void negativeTest() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AES/GCM/PKCS5Padding");
    }
}
