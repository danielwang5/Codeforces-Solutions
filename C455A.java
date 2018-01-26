import java.util.Arrays;
import java.util.Scanner;


public class C455A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] dir = sc.nextLine().split(" ");
		String first = dir[0];
		String last = dir[1];
		
		String letters = "abcdefghijklmnopqrstuvwxyz";
		
		String ans = first.substring(0, 1) + last.substring(0, 1);
		
		for(int x=0; x<first.length(); x++){
			for(int y=0; y<last.length(); y++){
				String poss = first.substring(0, x+1) + last.substring(0, y+1);
				//System.out.println(poss.compareTo(ans));
				if(poss.compareTo(ans) < 0){
					ans = poss;
				}
			}
		}
		
		
		
		
		System.out.println(ans);
	}
	
	static int p(String s){
		String letters = "abcdefghijklmnopqrstuvwxyz";
		return letters.indexOf(s);
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