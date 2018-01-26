import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CE35B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] dir = sc.nextLine().split(" ");
		int n = Integer.parseInt(dir[0]);
		int a = Integer.parseInt(dir[1]);
		int b = Integer.parseInt(dir[2]);
		
		int ans = 0;
		
		while(true){
			ans ++;
			
			//System.out.println(a/ans + b/ans);
			if(a/ans + b/ans < n){
				break;
			}
			
		}
		ans --;
		
		if(ans > a){
			ans = a;
		}
		if(ans > b){
			ans = b;
		}
		
		System.out.print(ans);
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