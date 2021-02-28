package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		int[] length = new int[N-1];
		int[] fuelPrice = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < length.length; i++) {
			length[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < fuelPrice.length; i++) {
			fuelPrice[i] = Integer.parseInt(st.nextToken());
		}
		
		long cost = 0;
		int tmpPrice = fuelPrice[0];
		for (int i = 0; i < fuelPrice.length -1; i++) {
			
			if(fuelPrice[i+1] < fuelPrice[i]) {
				cost += tmpPrice * length[i];
				tmpPrice = fuelPrice[i+1];
			}else {
				cost += tmpPrice * length[i];
			}
			
		}
		
		bw.write("" + cost);
		
		bw.close();
	}

}