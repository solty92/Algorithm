package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2609 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int smaller = a > b ? b : a ;
		
		// 최대공약수 찾기
		int gcd = 0;
		for (int i = smaller; i > 0; i--) {

			if(a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
			
		}
		
		bw.write(gcd + "\n");
		
		// 최소공배수 찾기
		int aLcm = a / gcd;
		int bLcm = b / gcd;
		
		int lcm = aLcm * bLcm * gcd;
		
		bw.write(lcm + "");
		
		bw.close();
	}

}