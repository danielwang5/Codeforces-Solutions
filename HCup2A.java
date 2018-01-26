import java.util.Arrays;
import java.util.Scanner;


public class HCup2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = Integer.parseInt(sc.nextLine());
		for(int x=0; x<z; x++){
			
			int answer = 0;
			
			String[] dir = sc.nextLine().split(" ");
			int n = Integer.parseInt(dir[0]);
			int m = Integer.parseInt(dir[1]);
			int k = Integer.parseInt(dir[2]);
			
			int a = Math.max(m,n);
			int b = Math.min(m,n);
			
			if(k == 1){
				if(a >= 5 && b == 2){
					answer = 2;
				}
				if(a >= 5 && b == 3){
					answer = 3;
				}
				if(a >= 5 && b == 4){
					answer = 4;
				}
				else if(a >= 5 && b >= 5){
					answer = 5;
				}
				else{
					answer = -1;
				}
			}
			else if((a-1)/k <= 2){
				answer = -1;
			}
			else if((b-1)/k <= 1){
				if(a >= 3+2*k){
					answer = 2;
				}
				else{
					answer = -1;
				}
			}
			else if((b-1)/k <= 2){
				if(a >= 3+2*k){
					answer = 3;
				}
				else{
					answer = -1;
				}
			}
			else{
				answer = 4;
			}
			
			
			System.out.println("Case #"+(x+1)+": "+answer);
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
