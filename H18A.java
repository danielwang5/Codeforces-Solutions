import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class H18A {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(sc.readLine());
		
		long m = Long.parseLong(sc.readLine());
		
		if(n > 40){
			System.out.print(m);
		}
		
		else{
			System.out.print(m % (long)Math.pow(2,n));
		}
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