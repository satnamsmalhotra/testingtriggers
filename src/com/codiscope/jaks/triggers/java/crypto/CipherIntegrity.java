package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class CipherIntegrity {

    public void cipherIntegrity() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AAA/ECB/AAA");
        Cipher cipher1 = Cipher.getInstance("AAA/CBC/AAA");
        Cipher cipher2 = Cipher.getInstance("AAA/OFB/AAA");
        Cipher cipher3 = Cipher.getInstance("AAA/CTR/AAA");

    }
}
