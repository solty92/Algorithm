package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int numbOfCase;
	static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			
			numbOfCase = 0;
			
			findCase(N, 0);
			
			bw.write(numbOfCase + "\n");
			
			if(N == 0) break;
		}
		
		bw.close();
	}

	private static void findCase(int possibleW, int possibleH) {

		if(possibleW == 0) {
			numbOfCase++;
			return;
		}
		
		//	반쪽 알약 없으면 무조건 하나를 반으로 쪼갠다 
		if(possibleH == 0) {
			findCase(possibleW - 1, possibleH + 1);
		}else {
			// 반쪽 알약이 존재할 경우엔 하나를 반으로 쪼개거나 반쪽짜리를 먹거나 
			findCase(possibleW - 1, possibleH + 1);
			findCase(possibleW, possibleH - 1);
		}
		
		
	}
	
}