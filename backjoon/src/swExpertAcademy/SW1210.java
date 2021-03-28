package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW1210 {
	
	static int[][] arr;
	static int startPoint;
	static boolean[][] isVisited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			
			arr = new int[100][100];
			isVisited = new boolean[100][100];
			
			for (int j = 0; j < 100; j++) {
				
				st = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < 100; j2++) {
					arr[j][j2] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int start = 0; start < 100; start++) {
				
				if(arr[99][start] == 2) {
					dfs(99, start);
				}
				
			}
			
			bw.write("#" + i + " " + startPoint + "\n");
			
		}// end for

		bw.close();
	}
	
	public static void dfs(int startRow, int startColumn) {
		
		isVisited[startRow][startColumn] = true;
		
		if(startRow == 0) {
			startPoint = startColumn;
			return;
		}
		
		int left = startColumn - 1;
		int right = startColumn + 1;
		int up = startRow - 1;
		
		if(left >= 0 && arr[startRow][left] == 1 && !isVisited[startRow][left]) {
			dfs(startRow, left);
			
		}else if(right < 100 && arr[startRow][right] == 1 && !isVisited[startRow][right]) {
			dfs(startRow, right);
		}else {
			dfs(up, startColumn);
		}
		
	}
	
}