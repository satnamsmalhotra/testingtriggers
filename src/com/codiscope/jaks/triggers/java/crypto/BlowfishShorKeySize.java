package com.codiscope.jaks.triggers.java.crypto;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BlowfishShorKeySize {

	public SecretKey weakKeySize1() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        keyGen.init(64);

        SecretKey key = keyGen.generateKey();
        return key;
    }

    public SecretKey weakKeySize2() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        keyGen.init(96, new SecureRandom());

        SecretKey key = keyGen.generateKey();
        return key;
    }

    public SecretKey okKeySize1() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        keyGen.init(128, new SecureRandom());

        SecretKey key = keyGen.generateKey();
        return key;
    }
}
