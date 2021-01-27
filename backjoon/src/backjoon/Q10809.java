package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		int lastIndex = word.length()-1;
		
		for (int i = 97; i < 123; i++) {
			for (int j = 0; j < word.length(); j++) {
				if((word.charAt(j))==(char)i) {
					bw.write(j+" ");
					break;
				}
				if(j == lastIndex && word.charAt(lastIndex) != (char)i) {
					bw.write("-1 ");
				}
			}
		}
		bw.flush();
		bw.close();
		
	}
}