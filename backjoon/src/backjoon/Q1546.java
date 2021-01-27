package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int subject = Integer.parseInt(br.readLine());
		String[] score = new String[subject];
		
		score = (br.readLine().split(" "));
		
		int max = 0;
		for (int i = 0; i < score.length; i++) {
			int tmp = Integer.parseInt(score[i]);
			if(tmp > max) {
				max = tmp;
			}
		}
		
		double newScoreTotal = 0;
		for (int i = 0; i < score.length; i++) {
			double tmp = Double.parseDouble(score[i]);
			newScoreTotal += tmp/max * 100;
		}
		
		bw.write(newScoreTotal/subject+"");
		
		bw.flush();
		br.close();
		bw.close();
	}
}