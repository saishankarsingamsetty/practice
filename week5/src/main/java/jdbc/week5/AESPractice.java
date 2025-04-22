package jdbc.week5;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class AESPractice {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		KeyGenerator keygen= KeyGenerator.getInstance("AES");
		keygen.init(128);
		SecretKey secretKey = keygen.generateKey();
		
		String text = "hello world";
		System.out.println(text);
		Cipher encryptedCipher = Cipher.getInstance("AES");
		encryptedCipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptedBytes= encryptedCipher.doFinal(text.getBytes());
		System.out.println(Arrays.toString(encryptedBytes));
		String encryptedmsg=Base64.getEncoder().encodeToString(encryptedBytes);
		System.out.println(encryptedmsg);
		
		
		Cipher decryptCipher = Cipher.getInstance("AES");
		decryptCipher.init(Cipher.DECRYPT_MODE,secretKey);
		byte[] decodedBytes = Base64.getDecoder().decode(encryptedmsg.getBytes());
		System.out.println(Arrays.toString(decodedBytes));
		byte[] decryptedBytes = decryptCipher.doFinal(decodedBytes);
		System.out.println(new String(decryptedBytes));
		
	}
}
