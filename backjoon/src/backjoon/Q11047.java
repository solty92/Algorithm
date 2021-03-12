package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] wallet = new int[N];
		int count = 0;
		
		for (int i = 0; i < wallet.length; i++) {
			wallet[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = wallet.length-1; i >= 0 ; i--) {
			
			if(K >= wallet[i]) {
				count += K / wallet[i];
				K %= wallet[i];
			}
			
			if(K == 0) break;
		}
		
		bw.write("" + count);
		
		bw.close();
	}

}