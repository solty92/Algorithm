package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] array = br.readLine().split(" ");
		int[] cardArray = new int[N];
		
		for (int i = 0; i < array.length; i++) {
			cardArray[i] = Integer.parseInt(array[i]);
		}
		
		Arrays.sort(cardArray);
		
		int result = 0;
		int tmp = 0;
		for (int i = N-1; i >= 2 ; i--) {
			for (int j = i-1; j >= 1; j--) {
				for (int j2 = j-1; j2 >= 0; j2--) {
					tmp = cardArray[i] + cardArray[j] + cardArray[j2];
					if( tmp <= M && tmp > result ) {
						result = cardArray[i] + cardArray[j] + cardArray[j2];
						if(result == M) {
							break;
						}
					}
				}
				
			}
		}
		
		bw.write(result + "");
		bw.close();
		
	}
	
}