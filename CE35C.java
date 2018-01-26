import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CE35C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] dir = sc.nextLine().split(" ");
		int a = Integer.parseInt(dir[0]);
		int b = Integer.parseInt(dir[1]);
		int c = Integer.parseInt(dir[2]);
		
		boolean ans = false;
		
		if(a==3 && b==3 && c==3){
			ans = true;
		}
		if(a==2 && b==4 && c==4){
			ans = true;
		}
		if(a==4 && b==4 && c==2){
			ans = true;
		}
		if(a==4 && b==2 && c==4){
			ans = true;
		}
		if(a==2 && b==2){
			ans = true;
		}
		if(c==2 && b==2){
			ans = true;
		}
		if(a==2 && c==2){
			ans = true;
		}
		if(a==1){
			ans = true;
		}
		if(b==1){
			ans = true;
		}
		if(c==1){
			ans = true;
		}
		
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