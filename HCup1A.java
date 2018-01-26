package problems;


import java.util.Arrays;
import java.util.Scanner;


public class HCup1A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = Integer.parseInt(sc.nextLine());
		for(int x=0; x<z; x++){
			
			String[] dir = sc.nextLine().split(" ");
			int n = Integer.parseInt(dir[0]);
			int m = Integer.parseInt(dir[1]);
			
			int[][] pies = new int[n][m];
			
			int[] piesSold = new int[n];
			
			for(int r = 0; r<n; r++){
				String[] sale = sc.nextLine().split(" ");
				for(int c=0; c<m; c++){
					pies[r][c] = Integer.parseInt(sale[c]);
				}
				
				Arrays.sort(pies[r]);
				
			}
			
			long answer = 0;
			
			for(int day=0; day<n; day++){
				int min = 999999999;
				int mindex = 0;
				for(int j=0; j<day+1; j++){
					if(piesSold[j] < m && pies[j][piesSold[j]] + piesSold[j]*2 + 1 < min){
						min = pies[j][piesSold[j]] + piesSold[j]*2 + 1;
						mindex = j;
					}
				}
				
				answer += min;
				piesSold[mindex]++;
				
				//System.out.println(min+"::::"+mindex);
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
