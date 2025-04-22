package jdbc.week5;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAPractice {

	public static void main(String[] args) throws Exception {
		String text="hello world!";
		System.out.println(text);
		
		KeyPairGenerator keygen= KeyPairGenerator.getInstance("RSA");
		keygen.initialize(2048);
		
		KeyPair pair=keygen.generateKeyPair();
		
		Cipher encryptCipher = Cipher.getInstance("RSA");
		encryptCipher.init(Cipher.ENCRYPT_MODE,pair.getPublic());
		byte[] encryptedbytes = encryptCipher.doFinal(text.getBytes());
		
		String encodetext=Base64.getEncoder().encodeToString(encryptedbytes);
		
		byte[] decodedBytes=Base64.getDecoder().decode(encodetext.getBytes());
		
		Cipher decryptCipher = Cipher.getInstance("RSA");
		decryptCipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
		byte[] decryptedBytes = decryptCipher.doFinal(decodedBytes);
		String text1=new String(decryptedBytes);
		System.out.println(text1);
		
	}
}
