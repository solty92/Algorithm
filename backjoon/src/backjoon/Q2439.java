package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int repeat = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= repeat; i++) {
			for (int j = repeat; j > i; j--) {
				bw.write(" ");
			}
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
