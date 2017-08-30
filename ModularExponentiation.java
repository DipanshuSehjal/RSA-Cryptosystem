
public class ModularExponentiation {
	

	
 	public long getModularExponent(long b,long e, long m) {
 		
 		long x = 1, power = 1;
 		int numBits;
 		//System.out.println("b: "+b+ " e: "+e+" m: "+m);
 		numBits = (Long.toBinaryString(e).length());
 		long binary = Long.parseLong(Long.toBinaryString(e));
	
 		power = b%m;
	
 		for(int i=0; i<numBits; i++) {
				
				if(binary%10 == 1) 
					x = (x*power)%m;
				
				power = (power*power)%m;
				binary = binary/10;
	
 		}
// 		System.out.println("x in Modular: "+x);
 		return x;
 	
 	}
}