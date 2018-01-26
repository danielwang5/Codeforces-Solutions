import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GB17D {
	public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			
			int z = 1;
			for(int x=1; x<100; x++){
				System.out.println(x+": "+z);
				z *= 2;
				z %= 1000000007;
			}
	}
}