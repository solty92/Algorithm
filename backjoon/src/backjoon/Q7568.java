package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		
		int[][] weightHeightRank = new int[testCase][3];
		
		StringTokenizer st;
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			
			weightHeightRank[i][0] = Integer.parseInt(st.nextToken());
			weightHeightRank[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < weightHeightRank.length; i++) {
			int biggerCount = 0;
			for (int j = 0; j < weightHeightRank.length; j++) {
				if(i == j) {
					continue;
				}else if(weightHeightRank[j][0] > weightHeightRank[i][0] && weightHeightRank[j][1] > weightHeightRank[i][1]) {
					biggerCount++;
				}
			}
			weightHeightRank[i][2] = biggerCount+1;
		}
		
		for (int i = 0; i < weightHeightRank.length; i++) {
			bw.write(weightHeightRank[i][2] + " ");
		}
		
		bw.close();
		
	}
	
}