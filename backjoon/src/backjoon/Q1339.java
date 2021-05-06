package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1339 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] alphabet = new int[26];

		int wordCount = Integer.parseInt(br.readLine());
		
		// 각 알파벳 별로 숫자를 정하기 전의 숫자를 배열에 저장 
		for (int i = 0; i < wordCount; i++) {
			
			String word = br.readLine();
			
			int times = 1;
			
			for (int j = word.length() - 1 ; j >= 0; j--) {
				
				char alph = word.charAt(j);
				alphabet[alph - 65] += times;
				
				times *= 10;
				
			}
			
		}
		
		// 큰 숫자들부터 9부터 0까지 곱한다 
		Arrays.sort(alphabet);
		
		int result = 0;
		int number = 9;
		for (int i = alphabet.length - 1; i >= 0 ; i--) {
			
			if(alphabet[i] == 0) break;
			
			result += alphabet[i] * number--;
		}
		
		bw.write(result + "");
		
		bw.close();
	}
}