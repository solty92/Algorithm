package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW1208 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int chanceCount, j;
		int difference = 0;
		int[] arr;
		for (int i = 1; i < 11; i++) {
			chanceCount = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			arr = new int[100];
			
			j = 0;
			while(st.hasMoreTokens()) {
				arr[j++] = Integer.parseInt(st.nextToken());
			}
			
			for (int k = 0; k < chanceCount; k++) {
				Arrays.sort(arr);
				arr[99]--;
				arr[0]++;
				
				difference = arr[99] - arr[0];
				if(difference == 1 || difference == 0) break;
			}
			
			Arrays.sort(arr);
			difference = arr[99] - arr[0];
			
			bw.write("#" + i + " " + difference + "\n");
		}	//end for
		
		
		bw.close();
	}
}
