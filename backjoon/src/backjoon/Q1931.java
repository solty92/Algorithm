package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] beginEnd = new int[N][2];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			beginEnd[i][0] = Integer.parseInt(st.nextToken()); 
			beginEnd[i][1] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(beginEnd, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}else {
				return e1[1] - e2[1];
			}
		});
		
		int endTime = beginEnd[0][1];
		int count = 1;
		
		for (int i = 1; i < beginEnd.length; i++) {
			int startTime = beginEnd[i][0];
			
			if(startTime >= endTime) {
				endTime = beginEnd[i][1];
				count++;
				continue;
			}
		}
		
		bw.write("" + count);
		
		bw.close();
	}

}