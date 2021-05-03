package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		
		arr = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = price();
		
		bw.write(result + "");
		
		bw.close();
	}

	private static int price() {
		
		// 가장 비싼 카드팩 찾기 
		int mostExpensiveIdx = 0;
		double perPrice = 0;
		for (int i = 1; i <= N; i++) {
			
			if((double) arr[i]/i > perPrice) {
				perPrice = (double) arr[i]/i ;
				mostExpensiveIdx = i;
			}
			
		}
		
		if(N % mostExpensiveIdx == 0) {
			return ( N / mostExpensiveIdx) * arr[mostExpensiveIdx];
		}else {
			int tmp = ( N / mostExpensiveIdx) * arr[mostExpensiveIdx];
			tmp += arr[( N % mostExpensiveIdx )] * ( N % mostExpensiveIdx );
			
			return tmp;
		}
		
	}
}