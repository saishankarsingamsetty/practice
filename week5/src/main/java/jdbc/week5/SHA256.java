package jdbc.week5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class SHA256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String msg="password";
		
		System.out.println("original msg: "+msg);
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		
		byte[] hashedBytes = digest.digest(msg.getBytes());
		
		System.out.println("encrypted bytes: "+Arrays.toString(hashedBytes));
		
		String encodedMsg = Base64.getEncoder().encodeToString(hashedBytes);
		
		System.out.println("encoded msg: "+encodedMsg);
		
		byte[] decodedBytes = Base64.getDecoder().decode(encodedMsg);
		
		System.out.println("decoded bytes: "+Arrays.toString(decodedBytes));
		
		
		
	}
}
