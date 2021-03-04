package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q2667 {
	
	static int N, count;
	static int[][] map;
	static boolean[][] isVisited;
	static ArrayList<Integer> countList = new ArrayList<Integer>();
	static int[] xArray = {-1, 0, 1, 0}; 
	static int[] yArray = {0, 1, 0, -1}; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		isVisited = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			String inpt = br.readLine();
			
			for (int j = 0; j < N; j++) {
				map[i][j] = inpt.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				if( map[i][j] == 1 && !isVisited[i][j] ) {
					count = 0;
					dfs(i, j);
					countList.add(count);
				}
			}
		}
		
		countList.sort(null);
		bw.write(countList.size() + "\n");
		for(int a : countList) {
			bw.write(a + "\n");
		}
		
		bw.close();
	}
	
	// dfs
	public static void dfs(int x, int y) {
		isVisited[x][y] = true;
		count++;
		
		for (int i = 0; i < 4; i++) {
			int tmpX = x + xArray[i];
			int tmpY = y + yArray[i];
			
			if(tmpX >= 0 && tmpY >= 0 && tmpX < N && tmpY < N && map[tmpX][tmpY] ==1 && !isVisited[tmpX][tmpY]) {
				dfs(tmpX, tmpY);
			}
		}
		
	}
	
}