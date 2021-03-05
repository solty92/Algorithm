package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1012 {
	static int[] nArray = {-1, 0, 1, 0};
	static int[] mArray = {0, 1, 0, -1};
	static boolean[][] isVisited;
	static int count;
	static int M, N, total;
	static int[][] map;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < testCase; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			total = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			isVisited = new boolean[N][M];
			
			// 배추 지도 만들기
			for (int j = 0; j < total; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				map[y][x] = 1;
			}
			
			
			// 각 한점씩 돌면서 dfs수행
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					
					if(map[j][j2] == 1 && !isVisited[j][j2]) {

						count++;
						
						dfs(j, j2);
					}
					if(total == 0) break;
				}
			}
			bw.write(count + "\n");
		}
		
		bw.close();
	}
	
	//dfs
	public static void dfs(int n, int m) {
		total--;
		isVisited[n][m] = true;
		
		for (int i = 0; i < 4; i++) {
			int tmpN = n + nArray[i];
			int tmpM = m + mArray[i];
			
			if(tmpN >= 0 && tmpM >= 0 && tmpN < N && tmpM < M && map[tmpN][tmpM] == 1 && !isVisited[tmpN][tmpM]) {

				dfs(tmpN, tmpM);
			}
		}
		
	}
}