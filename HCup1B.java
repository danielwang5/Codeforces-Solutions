package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class HCup1B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = Integer.parseInt(sc.nextLine());
		for(int x=0; x<z; x++){
			
			String[] dir = sc.nextLine().split(" ");
			int n = Integer.parseInt(dir[0]);
			int r = Integer.parseInt(dir[1]);
			
			int answer = 0;
			
			//int[] xx = new int[n];
			//int[] yy = new int[n];
			
			int[][] rc = new int[n][2];
			
			for(int c=0; c<n; c++){
				String[] di = sc.nextLine().split(" ");
				int a = Integer.parseInt(di[0]);
				int b = Integer.parseInt(di[1]);
				//xx[c] = a;
				//yy[c] = b;
				rc[c][0] = a;
				rc[c][1] = b;
				
			}
			
			
			
			//System.out.println(Arrays.deepToString(rc));
			
			//Arrays.sort(xx);
			//Arrays.sort(yy);
			
			//int[][] rcx = rc.clone();
			//int[][] rcy = rc.clone();
			//Arrays.sort(rcx, (a, b) -> Double.compare(a[0], b[0]));
			//Arrays.sort(rcy, (a, b) -> Double.compare(a[0], b[0]));
			
			int maxX = 0;
			int maxY = 0;
			int max = 0;
			int cc=0;
			
			ArrayList<int[]> remaining = new ArrayList<int[]>();
			
			//System.out.println(remaining);
			
			for(int nx=0; nx<n; nx++){
				int x_coord = rc[nx][0];
				for(int ny=0; ny<n; ny++){
					cc=0;
					
					int y_coord = rc[ny][1];
					for(int rc_index=0; rc_index<n; rc_index++){
						if(rc[rc_index][0]>=x_coord && rc[rc_index][0]<=x_coord+r &&
						   rc[rc_index][1]>=y_coord && rc[rc_index][1]<=y_coord+r){
							//remaining.add(rc[rc_index]);
							cc++;
						}
					}
					if(cc>max){
						max = cc;
						maxX = x_coord;
						maxY = y_coord;
					}
				}
			}
			
			for(int rc_index=0; rc_index<n; rc_index++){
				if(rc[rc_index][0]<maxX || rc[rc_index][0]>maxX+r ||
				   rc[rc_index][1]<maxY || rc[rc_index][1]>maxY+r){
					remaining.add(rc[rc_index]);
				}
			}
			
			//System.out.println(max+"::"+maxX+"-"+maxY);
			//System.out.println(remaining.size());
			
			answer += max;
			
			maxX = 0;
			maxY = 0;
			max = 0;
			cc=0;
			
			
			
			for(int nx=0; nx<remaining.size(); nx++){
				int x_coord = remaining.get(nx)[0];
				for(int ny=0; ny<remaining.size(); ny++){
					cc=0;
					
					int y_coord = remaining.get(ny)[1];
					for(int rc_index=0; rc_index<remaining.size(); rc_index++){
						if(remaining.get(rc_index)[0]>=x_coord && remaining.get(rc_index)[0]<=x_coord+r &&
								remaining.get(rc_index)[1]>=y_coord && remaining.get(rc_index)[1]<=y_coord+r){
							cc++;
						}
					}
					if(cc>max){
						max = cc;
						maxX = x_coord;
						maxY = y_coord;
					}
				}
			}
			
			answer += max;
			
			//System.out.println(max+"::"+maxX+"-"+maxY);
			
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
