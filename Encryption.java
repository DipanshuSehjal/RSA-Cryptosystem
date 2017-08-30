import java.util.ArrayList;
// M < N always
public class Encryption {
	private long e=13;

	protected long p=11;

	protected long q=17;

	private long N = p*q;
	
	private ArrayList<Long> C = new ArrayList<Long>();
	
	private String msg;
	
	
	public Encryption(String msg) {
		this.msg = msg;
	}
	
	public Encryption() {
		
	}
	public long getEncryptionExponent() {
		return e;
	}
	
	public long getModulus() {
		return N;
	}
	
	public String getOriginalMessage() {
		return msg;
	}
	
	private int blockSize =0; 
		
	
	public ArrayList<Long> encrypt() {
		int M ; 
		if(N < 252525)
			blockSize = 4;
		if(N < 2525)
			blockSize = 2;
		ModularExponentiation cMod = new ModularExponentiation();
		
		for(int i=0; i<msg.length(); i++) {
			
			char ch = msg.charAt(i); // convert string to char
			//System.out.println(ch);
			M = (int) ch; // take ascii of char;
			
			//System.out.println(M%N);
			//System.out.println(M%N+" "+e+" "+N);
			
			C.add(cMod.getModularExponent(M%N,e,N));
			//System.out.println("element in C "+cMod.getModularExponent(M,e,N));
		}

		return C;
	}
}
