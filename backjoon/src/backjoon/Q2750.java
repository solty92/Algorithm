package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Q2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(br.readLine());
			array.add(tmp);
		}
		
		array.sort(Comparator.naturalOrder());

		for (int i = 0; i < array.size(); i++) {
			bw.write(array.get(i) + "\n");
		}
		
		bw.close();
	}
}