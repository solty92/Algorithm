package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Solution {

	static int[][] ladderArr;
	static int shortestStartPoint;
	static boolean[][] isVisited;
	static int tmpCount;
	static int minCount;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();

			ladderArr = new int[100][100];
			isVisited = new boolean[100][100];
			minCount = Integer.MAX_VALUE;
			shortestStartPoint = 0;

			// 지도 그리기
			for (int row = 0; row < 100; row++) {

				st = new StringTokenizer(br.readLine());
				
				for (int column = 0; column < 100; column++) {
					ladderArr[row][column] = Integer.parseInt(st.nextToken());
				}
			}
			
//			System.out.println(Arrays.deepToString(ladderArr));
			
			// 끝점에서 시작점으로 가기
			for (int endPoint = 0; endPoint < 100; endPoint++) {
				tmpCount = 0;
				if(ladderArr[99][endPoint] == 1) dfs(99, endPoint);
			}
			
			bw.write("#" + testCase + " " + shortestStartPoint + "\n");
			System.out.println("---------------------------------------------");
			

		}

		bw.close();
	}

	public static void dfs(int startRow, int startColumn) {

		isVisited[startRow][startColumn] = true;
		tmpCount++;

		if (startRow == 0) {
			if (tmpCount < minCount) {
				System.out.println("count : " + tmpCount + "   <   " + "maxCount : " + minCount);
				System.out.println("shortestStartPoint : " + shortestStartPoint);
				minCount = tmpCount;
				shortestStartPoint = startColumn;
			}
			return;
		}

		int left = startColumn - 1;
		int right = startColumn + 1;
		int up = startRow - 1;

		if (left >= 0 && ladderArr[startRow][left] == 1 && !isVisited[startRow][left]) {
			dfs(startRow, left);

		} else if (right < 100 && ladderArr[startRow][right] == 1 && !isVisited[startRow][right]) {
			dfs(startRow, right);
		} else {
			dfs(up, startColumn);
		}

	}

}