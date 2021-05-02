package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4811 {
	
	static long[][] arr; 
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		arr = new long[31][31];
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			
			long result = findCase(N, 0);
			
			bw.write(result + "\n");
			
			
		}
		
		bw.close();
	}

	private static long findCase(int possibleW, int possibleH) {
		
		if(arr[possibleW][possibleH] != 0) return arr[possibleW][possibleH];

		if(possibleW == 0) {
			return 1;
		}
		
		//	반쪽 알약 없으면 무조건 하나를 반으로 쪼갠다 
		long tmp = 0;
		
		if(possibleH == 0) {
			tmp = findCase(possibleW - 1, possibleH + 1);
			arr[possibleW][possibleH] = tmp;
			return tmp;
		}else {
			// 반쪽 알약이 존재할 경우엔 하나를 반으로 쪼개거나 반쪽짜리를 먹거나 
			tmp = findCase(possibleW - 1, possibleH + 1);
			tmp += findCase(possibleW, possibleH - 1);
			arr[possibleW][possibleH] = tmp;
			return tmp;
		}
		
		
	}
	
}