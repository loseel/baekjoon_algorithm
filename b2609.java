package moonsol;

import java.io.*;

public class b2609 {
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
			gcd(a, b);
		}
		return a;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);

		int result = gcd(x,y);
		
		System.out.println(result);
		System.out.println((x * y) / result);
	}
}
