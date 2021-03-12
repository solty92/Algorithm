package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String[] array = new String[N];
		for (int i = 0; i < N; i++) {
			array[i] = br.readLine();
		}

		Arrays.sort(array, (e1, e2) -> {
			if(e1.length() == e2.length()) {
				return e1.compareTo(e2);
			}else {
				return e1.length() - e2.length();
			}
		});
		
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		
		for(String s : set) {
			bw.write(s + "\n");
		}
		
		
		bw.close();
	}

}