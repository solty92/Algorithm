package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		int[] array = new int[91];
		
		
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			int number = (int)letter;
			if(number < 91) {
				array[letter]++;
			}else {
				array[letter-32]++;
			}
		}
		
		int max = 0;
		int iValue = 0;
		for (int i = 65; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
				iValue = i;
			}
		}
		
		char result=(char)iValue;
		for (int i = 65; i < array.length; i++) {
			if(array[i] == max && i != iValue) {
				result = '?';
			}
		}
		bw.write(result);
		
		bw.flush();
		bw.close();
		
	}
}