package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW1209 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] arr;
		StringTokenizer st;
		

		for (int i = 1; i <= 10; i++) {
			br.readLine();
			arr = new int[100][100];
			int greatestRowSum = 0;
			int greatestColumnSum = 0;
			int greatestDiagonalSum = 0;
			
			// 배열 만드는 동시에 행의 합 구하기 
			int tmpRowSum;
			for (int j = 0; j < 100; j++) {
				tmpRowSum = 0;
				st = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < 100; j2++) {
					int value = Integer.parseInt(st.nextToken());
					arr[j][j2] = value;
					tmpRowSum += value;
				}
				
				greatestRowSum = greatestRowSum < tmpRowSum ? tmpRowSum : greatestRowSum;
			}
			
			// 열의 최고합 구하기
			int tmpColumnSum;
			for (int j = 0; j < 100; j++) {
				tmpColumnSum = 0;
				for (int j2 = 0; j2 < 100; j2++) {
					tmpColumnSum += arr[j2][j];
				}
				
				greatestColumnSum = greatestColumnSum < tmpColumnSum ? tmpColumnSum : greatestColumnSum;
			}
			
			// 대각선 최고합 구하기
			int tmpDiagonalSum1 = 0;
			int a = 0;
			int b = 0;
			for (int j = 0; j < 100; j++) {
				tmpDiagonalSum1 += arr[a++][b++];
			}
			
			int tmpDiagonalSum2 = 0;
			a = 0;
			b = 99;
			for (int j = 0; j < 100; j++) {
				tmpDiagonalSum2 += arr[a++][b--];
			}
			
			greatestDiagonalSum = tmpDiagonalSum1 > tmpDiagonalSum2 ? tmpDiagonalSum1 : tmpDiagonalSum2;
			
			// 최대값 찾
			int result = greatestRowSum;
			result = result < greatestColumnSum ? greatestColumnSum : result;
			result = result < greatestDiagonalSum ? greatestDiagonalSum : result;
			
			
			
			bw.write("#" + i + " " + result + "\n");
			
		}

		bw.close();
	}
}
