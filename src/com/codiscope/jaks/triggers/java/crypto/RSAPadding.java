package com.codiscope.jaks.triggers.java.crypto;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.Cipher;

public class RSAPadding {
	public static void main(String[] args) throws Exception {
		
		KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(2048);
		KeyPair keyPair = keyPairGenerator.genKeyPair();

		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher = Cipher.getInstance("RSA/ECB/NoPadding");
		cipher = Cipher.getInstance("RSA/.*/NoPadding");

		cipher = Cipher.getInstance(" / /NoPadding");

		cipher = Cipher.getInstance("RSA/AES/NoPadding", ""); // transformer and
																// provider
		cipher = Cipher.getInstance("RSA/ECB/NoPadding", " "); //
		// DES/CBC/PKCS5Padding
		cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
	}
}
