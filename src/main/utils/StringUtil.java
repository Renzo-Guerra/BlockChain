package utils;

import java.security.MessageDigest;

public class StringUtil {
	/**
	 * It takes a string and applies SHA256 algorithm to it, and returns the generated signature as a string.
	 * @param input (String) Text
	 * @return (String) Generated signature
	 */
	public static String applySha256(String input) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			
			// Applies sha256 to our input
			byte[] hash = digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer(); // This will contain hash as hexadecimal.
			String hex;
			
			for(int i = 0;i<hash.length;i++) {
				hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
			
			return hexString.toString();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
