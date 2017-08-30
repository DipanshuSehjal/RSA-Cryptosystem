
public class Inverse {
	private long e=0,N=0;
	
	public Inverse(long e, long N) {
		this.e = e;
		this.N = N;
	}
	//Correct it !!
	public long getInverse() { // d = inverse of e mod N where N = (p-1)*(q-1)
		//System.out.println("e: "+e+ " N: "+N);
		long m0 = N, t, q;
	    long x0 = 0, x1 = 1;
	 
	    if (N == 1)
	      return 0;
	 
	    while (e > 1)
	    {
	        // q is quotient
	        q = e / N;
	 
	        t = N;
	 
	        // m is remainder now, process same as
	        // Euclid's algo
	        N = e % N; 
	        e = t;
	 
	        t = x0;
	 
	        x0 = x1 - q * x0;
	 
	        x1 = t;
	    }
	 
	    // Make x1 positive
	    if (x1 < 0)
	       x1 += m0;
	 
	    return x1;
	
	}
	
	
}
