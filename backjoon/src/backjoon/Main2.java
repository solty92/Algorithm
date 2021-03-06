package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	static int[] xArray = {-1, 0, 1, 0};
	static int[] yArray = {0, 1, 0, -1};
	static boolean[][] isVisited;
	static int count;
	static int M, N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[][] arr = new boolean[3][5];
		
		System.out.println(Arrays.deepToString(arr));
	}
	
	//dfs
	public static void dfs(int x, int y) {
		isVisited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int tmpX = x + xArray[i];
			int tmpY = x + yArray[i];
			
			if(tmpX >= 0 && tmpY >= 0 && tmpX < M && tmpY < N && !isVisited[tmpX][tmpY]) {
				dfs(tmpX, tmpY);
			}
		}
		
	}
}