import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class C456D {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//System.out.print(evaluate(3,4,1,1,3));
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dir = sc.readLine().split(" ");
		int n = Integer.parseInt(dir[0]);
		int m = Integer.parseInt(dir[1]);
		int r = Integer.parseInt(dir[2]);
		int k = Integer.parseInt(dir[3]);
		
		double width, height;
		
		long sum = 0;
		
		if(n % 2 == 1 && m%2 == 1){
			
			int max = Math.max(0,n - (2*r - 2)) * Math.max(0, m - (2*r - 2));
			
			int counter = k;
			
			while(true){
				
				
				
				counter --;
				if(counter == 0){
					break;
				}
			}
		}
		
		
				
		
	}
	
	public static int evaluate(int n, int m, int x, int y, int r){
		int width = r; 
		int height = r;
		
		if(x < r){
			width -= r-x;
		}
		if(x > n-r){
			width -= r-(n-x+1);
		}
		if(y < r){
			height -= r-y;
		}
		if(y > m-r){
			height -= r-(m-y+1);
		}
		
		return width * height;
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