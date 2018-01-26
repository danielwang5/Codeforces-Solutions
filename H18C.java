import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class H18C {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dir = sc.readLine().split(" ");
		int n = Integer.parseInt(dir[0]);
		int L = Integer.parseInt(dir[1]);
		
		String[] t = sc.readLine().split(" ");
		int[] price = new int[n];
		for(int x=0; x<n; x++){
			price[x] = Integer.parseInt(t[x]);
			if(x>0 && 2*price[x-1] < price[x]){
				price[x] = 2*price[x-1];
			}
			
			//System.out.print(price[x] + ",");
		}
		
		//System.out.println("");
		
		for(int x=n-1; x>=1; x--){
			price[x] = Integer.parseInt(t[x]);
			if(price[x] < price[x-1]){
				price[x-1] = price[x];
			}
		}
		
		for(int x=1; x<n; x++){
			if(2*price[x-1] < price[x]){
				price[x] = 2*price[x-1];
			}
		}
		for(int x=n-1; x>=1; x--){
			price[x] = Integer.parseInt(t[x]);
			if(price[x] < price[x-1]){
				price[x-1] = price[x];
			}
		}
		
		for(int x=1; x<n; x++){
			if(2*price[x-1] < price[x]){
				price[x] = 2*price[x-1];
			}
		}
		for(int x=n-1; x>=1; x--){
			price[x] = Integer.parseInt(t[x]);
			if(price[x] < price[x-1]){
				price[x-1] = price[x];
			}
		}
		
		for(int x=1; x<n; x++){
			if(2*price[x-1] < price[x]){
				price[x] = 2*price[x-1];
			}
		}
		for(int x=n-1; x>=1; x--){
			price[x] = Integer.parseInt(t[x]);
			if(price[x] < price[x-1]){
				price[x-1] = price[x];
			}
		}
		
		for(int x=1; x<n; x++){
			if(2*price[x-1] < price[x]){
				price[x] = 2*price[x-1];
			}
		}
		
		System.out.print(bestValue(L, price, 0));
	}
	
	public static long bestValue(long n, int[] price, long total){
		//System.out.println(n);
		long n2 = 0,total2 = 0;
		if(n <= 0){
			return total;
		}
		else{
			long val = 9000000000000000000l;
			
			long mult = 1;
			int highest = (int) (Math.log(n) / Math.log(2));
			long bestIndex = highest+1;
			
			bestIndex = Math.max(0,Math.min(bestIndex, price.length - 1));
			
			for(int x=price.length - 1; x>=0; x--){
				long valuesss = price[x];
				//System.out.println(valuesss);
				if(valuesss < val && (long) Math.pow(2,x) >= n){
					val = valuesss;
					bestIndex = x;
				}

			}
			
			
			
			//n -= Math.pow(2, bestIndex);
			//total += price[bestIndex];
			
			long quantity = (long) Math.max(n/(long)Math.pow(2, bestIndex),1);
			
			//System.out.println("uiwg " + n + " " + bestIndex + " " + quantity);
			
			
			
			/*if(bestIndex>0){
				long quantity2 = (long) Math.max(n/(long)Math.pow(2, bestIndex-1),1);
				n2 = (long) (n - quantity2 * Math.pow(2, bestIndex-1));
				total2 = total + quantity2 * price[(int) bestIndex - 1];
						
				n -= quantity * Math.pow(2, bestIndex);
				total += quantity * price[(int) bestIndex];
				
				//System.out.println("jiop " + n2 + " " + (bestIndex - 1) + " " + quantity2);
						
			    return Math.min(bestValue(n, price, total),bestValue(n2, price, total2));
			}*/
			
			n -= quantity * Math.pow(2, bestIndex);
			total += quantity * price[(int) bestIndex];
		}
		
		return bestValue(n, price, total);
	}
}


/* 

BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

int n = Integer.parseInt(sc.readLine());
String[] t = sc.readLine().split(" ");
int[] list = new int[n];
for(int x=0; x<n; x++){
	list[x] = Integer.parseInt(t[x]);
}
		
String[] dir = sc.readLine().split(" ");
int a = Integer.parseInt(dir[0]);
int b = Integer.parseInt(dir[1]);
int c = Integer.parseInt(dir[2]);
int d = Integer.parseInt(dir[3]);
int e = Integer.parseInt(dir[4]);

int n = Integer.parseInt(sc.readLine());

*/