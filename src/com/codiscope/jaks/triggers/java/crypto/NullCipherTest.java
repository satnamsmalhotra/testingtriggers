package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.NullCipher;
import java.security.NoSuchAlgorithmException;

public class NullCipherTest {

    public void positiveTest(){
        NullCipher cipher = createNullCipher();
    }

    public void  negativeTest() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("RSA/CBC/PKCS1Padding");
    }

    private NullCipher createNullCipher(){
        return null;
    }

}
