import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;


public class CE35E {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dir = sc.readLine().split(" ");
		int n = Integer.parseInt(dir[0]);
		int k = Integer.parseInt(dir[1]);
		
		String[] t = sc.readLine().split(" ");
		int[] match = new int[k];
		for(int x=0; x<k; x++){
			match[x] = Integer.parseInt(t[x]);
		}
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		int curNum = 1;
		
		
		for(int x=0; x<k; x++){
			int matchVal = match[x];
			
			if(!stack.isEmpty() && stack.peek() == curNum){
				curNum ++;
				stack.pop();
				if(curNum > k){
					break;
				}
				continue;
			}
			
			else if(matchVal == curNum){
				curNum ++;
				if(curNum > k){
					break;
				}
				continue;
			}
			else{
			stack.add(matchVal);
			}
			
			System.out.print(stack);
		}
		
		if(!(curNum > k)){
			System.out.print("-1");
		}
		else{
			for(int x=0; x<k; x++){
				System.out.print(match[x]+" ");
			} 
			for(int x=n; x>= curNum; x--){
				System.out.print(x+" ");
			}
			
			while(!stack.isEmpty()){
				System.out.print(stack.pop()+" ");
			}
		}
		
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