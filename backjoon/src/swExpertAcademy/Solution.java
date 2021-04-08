package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		static int[][] storage;
		static boolean[][] isVisited;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseCount = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int testCase = 1; testCase <= caseCount; testCase++) {
			
			int N = Integer.parseInt(br.readLine());
			
			storage = new int[N][N];
			
			// 창고 담기 
			for (int row = 0; row < N; row++) {
				st = new StringTokenizer(br.readLine());
				
				for (int column = 0; column < N; column++) {
					storage[row][column] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 화학 물질 담김 용기 찾기 (0이 아닌거)
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					
				}
			}
			
		}
		
		
		bw.close();
	}
}