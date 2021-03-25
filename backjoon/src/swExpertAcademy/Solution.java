package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] arr;
		StringTokenizer st;

		for (int i = 1; i <= 10; i++) {
			br.readLine();
			arr = new int[100][100];

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 100; j++) {
				for (int j2 = 0; j2 < 100; j2++) {
					arr[j][j2] = Integer.parseInt(st.nextToken());
				}
			}
			
			bw.write(Arrays.toString(arr) + "\n");
		}

		bw.close();
	}
}
