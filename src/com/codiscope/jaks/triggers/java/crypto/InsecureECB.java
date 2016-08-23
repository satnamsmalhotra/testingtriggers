package com.codiscope.jaks.triggers.java.crypto;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class InsecureECB {

	
	public void positiveTest() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
	int value;
	byte[] plainText = new byte[4];
	Key key = null;
	SecureRandom random = SecureRandom.getInstance("");
	value = random.nextInt();
	Cipher cipher1 = Cipher.getInstance("AES/ECB/NoPadding");
	cipher1.init(Cipher.ENCRYPT_MODE, key,random);
	byte[] cipherText = cipher1.doFinal(plainText);
	}
	
	public void negativeTest() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
	int value;
	byte[] plainText = new byte[4];
	Key key = null;
	SecureRandom random = SecureRandom.getInstance("");
	value = random.nextInt();
	Cipher cipher1 = Cipher.getInstance("AES/GCM/NoPadding");
	cipher1.init(Cipher.ENCRYPT_MODE, key,random);
	byte[] cipherText = cipher1.doFinal(plainText);
	}
}
