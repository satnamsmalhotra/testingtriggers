package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class PaddingOracle {

    public void positiveTest(Key k, byte [] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }

    public void negativeTest(Key k, byte [] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }
}
