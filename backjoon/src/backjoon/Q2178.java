package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
	static int[] nArray = {-1, 0, 1, 0};
	static int[] mArray = {0, 1, 0, -1};
	static int[][] maze;
	static boolean[][] isVisited;
	static int N, M;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		maze = new int[N][M];
		char[][] arr = new char[N][M];
		isVisited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				maze[i][j] = arr[i][j] - '0';
			}
		}
		
		bfs();
		
	}
	
	// bfs
	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {0, 0});
		isVisited[0][0] = true;
		
		while(!q.isEmpty()) {
			int[] tmpLocation = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int tmpN = tmpLocation[0] + nArray[i];
				int tmpM = tmpLocation[1] + mArray[i];
				
				if(tmpN >= 0 && tmpM >= 0 && tmpN < N && tmpM < M && maze[tmpN][tmpM] == 1 && !isVisited[tmpN][tmpM]) {
					isVisited[tmpN][tmpM] = true;
					q.offer(new int[] {tmpN, tmpM});
					maze[tmpN][tmpM] = maze[tmpLocation[0]][tmpLocation[1]] + 1;
				}
			}
			
		}
		System.out.println(maze[N-1][M-1]);
	}
}