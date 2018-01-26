import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CE35AA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		String[] t = sc.nextLine().split(" ");
		int[] list = new int[n];
		for(int x=0; x<n; x++){
			list[x] = Integer.parseInt(t[x]);
		}
		
		int minVal = list[0];
		
		for(int x=0; x<n; x++){
			if(list[x] < minVal){
				minVal = list[x];
			}
		}
		
		
		int minDiff = 9999999;
		int counter = 0;
		boolean seen = false;
		
		for(int x=0; x<n; x++){
			counter++;
			if(list[x] == minVal){
				//System.out.println(counter);
				if(counter < minDiff && seen == true){
					minDiff = counter;
				}
				counter = 0;
				seen = true;
			}
		}
		System.out.print(minDiff);
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