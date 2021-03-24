package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW1206 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int length, count, j;
		int[] heightArr;
		for (int i = 1; i < 11; i++) {
			length = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			heightArr = new int[length];
			count = 0;
			
			j = 0;
			while(st.hasMoreTokens()) {
				heightArr[j++] = Integer.parseInt(st.nextToken());
			}
			
			int tallest;
			for (int j2 = 2; j2 < length-2; j2++) {
				tallest = 0;
				if(heightArr[j2-2] > tallest) tallest = heightArr[j2-2];
				if(heightArr[j2-1] > tallest) tallest = heightArr[j2-1];
				if(heightArr[j2+1] > tallest) tallest = heightArr[j2+1];
				if(heightArr[j2+2] > tallest) tallest = heightArr[j2+2];
				
				int tmpResult = heightArr[j2] - tallest;
				
				if(tmpResult > 0) {
					count += tmpResult;
				}
			}
			
			bw.write("#" + i + " " + count + "\n");
		}
		
		
		
		
		bw.close();
	}
}
