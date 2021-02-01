package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] apt = new int[15][15];
		
		for (int i = 0; i < apt.length; i++) {
			apt[0][i] = i;
			apt[i][1] = 1;
		}
		
		for (int i = 1; i < apt.length; i++) {
			for (int j = 2; j < apt.length; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase ; i++) {
			int floor = Integer.parseInt(br.readLine());
			int roomNumber = Integer.parseInt(br.readLine());
			
			bw.write("" + apt[floor][roomNumber] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
	
}