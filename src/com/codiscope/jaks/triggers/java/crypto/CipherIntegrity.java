package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class CipherIntegrity {

    public void positiveTest() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AAA/ECB/AAA");
        cipher = Cipher.getInstance("AAA/CBC/AAA");
        cipher = Cipher.getInstance("AAA/OFB/AAA");
        cipher = Cipher.getInstance("AAA/CTR/AAA");

    }

    public void negativeTest() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AAA/GCM/AAA");
    }
}
