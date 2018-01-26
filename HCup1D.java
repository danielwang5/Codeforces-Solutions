package problems;


import java.util.Arrays;
import java.util.Scanner;


public class HCup1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = Integer.parseInt(sc.nextLine());
		for(int x=0; x<z; x++){
			
			String[] dir = sc.nextLine().split(" ");
			int n = Integer.parseInt(dir[0]);
			int m = Integer.parseInt(dir[1]);
			
			m+= 1;
			
			for(int y=0; y<n; y++){
				m -= 2 * Integer.parseInt(sc.nextLine());
			}
			
			long answer = 0;
			
			System.out.print(n+":::"+m+":::");
			
			if(m>=0){
				long s=1;
				for(int f=n; f>1; f--){
					s *= f;
					s %= 1000000007;
				}
				answer = s;
				
				if(m>0){
				
					int g = m+n;
					int h = Math.min(m,n);
					
					int a=1;
					for(int f=g; f>g-h; f--){
						a *= f;
						a %= 1000000007;
					}
					
					answer = (answer*a) % 1000000007;
					
					
					int d=1;
					for(int f=h; f>1; f--){
						d *= f;
						d %= 1000000007;
					}
					
					answer *= modInverse(d, 1000000007);
					answer %= 1000000007;
				
				System.out.print(s+"<>"+a+"<>"+d+"<>");
				
				}
			}
			
			System.out.println("Case #"+(x+1)+": "+answer);
		}
		
	}
	
	static long modInverse(long a, long m)
	{
	    long m0 = m, t, q;
	    long x0 = 0, x1 = 1;
	 
	    if (m == 1)
	      return 0;
	 
	    while (a > 1)
	    {
	        // q is quotient
	        q = a / m;
	 
	        t = m;
	 
	        // m is remainder now, process same as
	        // Euclid's algo
	        m = a % m;
	        a = t;
	 
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

/*
int n = Integer.parseInt(sc.nextLine());
String[] t = sc.nextLine().split(" ");
int[] list = new int[n];
for(int x=0; x<n; x++){
	list[x] = Integer.parseInt(t[x]);
}
		
String[] dir = sc.nextLine().split(" ");
int a = Integer.parseInt(dir[0]);
int b = Integer.parseInt(dir[1]);
int c = Integer.parseInt(dir[2]);
int d = Integer.parseInt(dir[3]);
int e = Integer.parseInt(dir[4]);

int n = Integer.parseInt(sc.nextLine());
*/
