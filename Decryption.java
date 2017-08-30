import java.util.ArrayList;

public class Decryption extends Encryption{
	private long d;
	ArrayList<Long> Cipher = new ArrayList<Long>(); 
	
	public Decryption(ArrayList<Long> C) {
		this.Cipher = C;
		Inverse inv = new Inverse(this.getEncryptionExponent(), (p-1)*(q-1));
		this.d = inv.getInverse();
		
	}
	
	private long getDecryptExponent() {
			return this.d;
	}
	
	public String getDecryption() {
		ModularExponentiation MsgMod = new ModularExponentiation();
		String msg = "";
		long M;
		for(int i=0; i<Cipher.size(); i++) {
			M = MsgMod.getModularExponent(Cipher.get(i), getDecryptExponent(), getModulus());
			
			//System.out.println("M in decrypt: "+M);
			char b = (char) M;
			
			msg = msg + b; 
		}
		
		return msg;
	}

}
