import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C425B {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dir = sc.readLine().split(" ");
		long n = Long.parseLong(dir[0]);
		long k = Long.parseLong(dir[1]);
		
		boolean ans = n % (2*k) >= k;
		
		if(ans){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
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