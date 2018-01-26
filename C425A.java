import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class C425A {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] goodLetters = sc.readLine().split("");
		String[] pattern = sc.readLine().split("");
		String def = "abcdefghijklmnopqrstuvwxyz?*"; // ?=26, *=27
		
		int[] good = new int[goodLetters.length];
		for(int x=0; x<goodLetters.length; x++){
			good[x] = def.indexOf(goodLetters[x]);
			
		}
		
		int[] patt = new int[pattern.length];
		for(int x=0; x<pattern.length; x++){
			patt[x] = def.indexOf(pattern[x]);
			
		}
		
		int pattLen = pattern.length;
		
		int numQueries = Integer.parseInt(sc.readLine());
		
		for(int j=0; j<numQueries; j++){
			boolean ans = true;
			
			String[] quer = sc.readLine().split("");
			
			int[] query = new int[quer.length];
			for(int x=0; x<quer.length; x++){
				query[x] = def.indexOf(quer[x]);
				
			}
			
			int posPatt = 0;
			int posQuery = 0;
			while(posPatt < pattLen){
				
				if(pattLen - query.length > 1){
					ans = false;
					break;
				}
				if(pattLen - query.length == 1 && posPatt == pattLen - 1 && patt[posPatt] == 27){
					ans = true;
					break;
				}
				
				int p = patt[posPatt];
				
				int q = query[posQuery];
				
						
				if(p < 26){
					
					if(q != p){
						
						ans = false;
						break;
					}
					posPatt ++;
					posQuery++;
				}
				else if(p == 26){
					boolean found = false;
					for(int z=0; z<good.length; z++){
						if(good[z] == q){
							found = true;
							break;
						}
						
					}
					if(!found){
						ans = false;
						break;
					}
					posPatt ++;
					posQuery++;
				}
				else if(p == 27){
					int diff = quer.length - pattLen + 1;
					for(int x=0; x< diff; x++){
						q = query[posQuery];
						for(int z=0; z<good.length; z++){
							if(good[z] == q){
								ans = false;
								break;
							}
							
						}
						posQuery++;
					}
					posPatt++;
				}
			}
			
			if(ans){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
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