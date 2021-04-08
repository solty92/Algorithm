package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW1258 {

	static int[][] storage;
	static boolean[][] isVisited;
	static int[][] rowAndCol;
	static int N;
	static int chemicalCount;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseCount = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int testCase = 1; testCase <= caseCount; testCase++) {
			
			N = Integer.parseInt(br.readLine());
			
			storage = new int[N][N];
			isVisited = new boolean[N][N];
			rowAndCol = new int[20][2];
			chemicalCount = 0;
			
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
					if(storage[i][j] != 0 && !isVisited[i][j]) {
						check(i, j);
					}
				}
			}
			
			
			// 정렬
			Arrays.sort(rowAndCol, (t1, t2) -> {
				if(t1[0]*t1[1] == t2[0]*t2[1]) {
					return Integer.compare(t1[0], t2[0]);
				}else {
					return Integer.compare(t1[0]*t1[1], t2[0]*t2[1]);
				}
			});
			
			bw.write("#" + testCase + " " + chemicalCount);
			for (int i = 0; i < 20; i++) {
				if(rowAndCol[i][0] != 0) bw.write(" " + rowAndCol[i][0] + " " + rowAndCol[i][1]);
			}
			bw.write("\n");
			
		}
		
		
		bw.close();
	}
	
	static void check(int row, int col) {
		int rowSize = 0;
		int colSize = 0;
		
		for (int i = row; i < N; i++) {
			if(storage[i][col] == 0) break;
			
			rowSize++;
		}
		
		for (int i = col; i < N; i++) {
			if(storage[row][i] == 0) break;
			
			colSize++;
		}
		
		for (int i = row; i < row + rowSize; i++) {
			for (int j = col; j < col + colSize; j++) {
				isVisited[i][j] = true;
			}
		}
		
		rowAndCol[chemicalCount][0] = rowSize;
		rowAndCol[chemicalCount][1] = colSize;
		
		chemicalCount++;
	}
}