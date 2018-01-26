import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class GB17B {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dir = sc.readLine().split(" ");
		int n = Integer.parseInt(dir[0]);
		int m = Integer.parseInt(dir[1]);
		
		String[][] map = new String[n][m];
		int[] start = new int[2];
		
		for(int x=0; x<n; x++){
			String[] t = sc.readLine().split("");
			for(int y=0; y<m; y++){
				map[x][y] = t[y];
				if(t[y].equals("S")){
					start[0] = x;
					start[1] = y;
				}
			}
		}
		
		String[] dd = sc.readLine().split("");
		int[] commands = new int[dd.length];
		for(int y=0; y<dd.length; y++){
			commands[y] = Integer.parseInt(dd[y]);
		}
		
		int ans = 0;
		
		for(int u=0; u<4; u++){
			for(int l=0; l<4; l++){
				if(u != l){
					for(int r=0; r<4; r++){
						if(u != r && l != r){
							for(int d=0; d<4; d++){
								if(u != d && l != d && r != d){
									boolean crash = true;
									int xx = start[0];
									int yy = start[1];
									
									for(int i=0; i<commands.length; i++){
										
										int comm = commands[i];
										//System.out.println(comm);
										
										if(u == comm){
											xx -= 1;
										}
										else if(d == comm){
											xx += 1;
										}
										else if(l == comm){
											yy -= 1;
										}
										else if(r == comm){
											yy += 1;
										}
										
										if(xx<0 || xx>=n || yy<0 || yy>=m){ //out of bounds
											crash = true;
											break;
										}
										String curSpot = map[xx][yy];
										//System.out.println(curSpot);
										if(curSpot.equals("#")){
											crash = true;
											break;
										}
										else if(curSpot.equals("E")){
											crash = false;
											break;
										}
									}
									
									if(!crash){
										ans ++;
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.print(ans);
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