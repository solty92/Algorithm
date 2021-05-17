package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9461 {
	
	static long[] sequence;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		sequence = new long[101];
		sequence[1] = 1;
		sequence[2] = 1;
		sequence[3] = 1;
		sequence[4] = 2;
		
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			int n = Integer.parseInt(br.readLine());
			
			long result = findSeq(n);
			
			bw.write(result + "\n");
		}
		
		bw.close();
	}

	private static long findSeq(int numb) {
		
		if(sequence[numb] != 0) return sequence[numb];

		for (int idx = 5; idx <= numb; idx++) {
			if(sequence[idx] != 0) continue;
			
			sequence[idx] = sequence[idx-3] + sequence[idx-2];
		}
		
		return sequence[numb];
	}

}