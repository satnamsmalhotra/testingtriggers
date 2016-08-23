package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.*;
import java.security.Key;

public class NullCipherTest {

    public void positiveTest(Key k, byte [] bytes) throws Exception{
        NullCipher cipher = createNullCipher();
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }

    public void  negativeTest(Key k, byte [] bytes) throws Exception{
        Cipher cipher = Cipher.getInstance("RSA/GCM/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }

    private NullCipher createNullCipher(){
        return null;
    }

}
