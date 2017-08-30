import java.util.ArrayList;

public class TestRSA {

	public static void main(String[] args) {
	
		//Encryption
		Encryption encrypt = new Encryption("BEST OF JOURNEY, JAE");
		ArrayList<Long> cipherText = new ArrayList<Long>(); 
		cipherText  = encrypt.encrypt();
		System.out.println("Original message: "+encrypt.getOriginalMessage());
		System.out.println("Encrypted: "+cipherText);
		//
	
		//Decryption
		Decryption decrypt = new Decryption(cipherText);
		System.out.println("************************");
		System.out.println("Decrypted: "+decrypt.getDecryption());
		System.out.println("************************");
		
	}
	
	
	
	
	
	
	
}
