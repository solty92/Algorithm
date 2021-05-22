package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q6603 {
	
	static int[] numberPool, myNumbers;
	static BufferedWriter bw;
	static int size;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
						
			size = Integer.parseInt(st.nextToken());
			
			if(size == 0) break;
			
			
			numberPool = new int[size + 1];
			for (int i = 1; i <= size; i++) {
				numberPool[i] = Integer.parseInt(st.nextToken());
			}
			
			myNumbers = new int[7];
			
			combinatorics(1);
			
			bw.write("\n");
		}
		
		bw.close();
	}

	private static void combinatorics(int current) throws IOException {

		if(current > 6) {
			
			for (int i = 1; i <= 6; i++) {
				bw.write(myNumbers[i] + " ");
			}
			bw.write("\n");
			return;
		}
		
		
		
		for (int i = 1; i <= size; i++) {
			
			if(current != 1 && numberPool[i] <= myNumbers[current - 1]) {
				continue;
			}
			
			myNumbers[current] = numberPool[i];
			combinatorics(current + 1);
			
		}
		
		
	}
}