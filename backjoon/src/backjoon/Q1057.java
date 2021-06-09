package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1057 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Kim = Integer.parseInt(st.nextToken());
		int Lim = Integer.parseInt(st.nextToken());
		
		int count = 0;
		while(Kim != Lim) {
			count++;
			
			Kim = (Kim + 1) / 2;
			Lim = (Lim + 1) / 2;
		}
		
		bw.write(count + "");
		
		bw.close();
	}
}