package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1024 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int currentCase;
		
		for (int i = 0; i < testCase; i++) {
			currentCase = Integer.parseInt(br.readLine());
			int[] count = new int[101];
			
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				int score = Integer.parseInt(st.nextToken());
				count[score]++;
			}
			
			int maxApperance = 0;
			int score = 0;
			for (int j = 0; j < 101; j++) {
				if(count[j] >= maxApperance) {
					maxApperance = count[j];
					score = j;
				}
			}
			
			bw.write("#" + currentCase + " " + score + "\n");
		}
		
		
		bw.close();
	}
}
