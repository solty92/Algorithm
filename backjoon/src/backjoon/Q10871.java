package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int times = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		String secondLine = br.readLine();
		String[] array = new String[times];
		array = secondLine.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			int tmp = Integer.parseInt(array[i]);
			if(tmp<max) {
				bw.write(tmp+" ");
			}
		}
		bw.flush();
		bw.close();
		
	}
}
