package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206 {
	
	static class Place {
		int n;
		int m;
		int distance;
		int drillUsageCount;
		
		public Place(int n, int m, int distance, int drillUsageCount) {
			this.n = n;
			this.m = m;
			this.distance = distance;
			this.drillUsageCount = drillUsageCount;
		}
	}

	static int N, M, result;
	static int[][] map;
	static boolean[][][] isVisited;	//[N][M][0] : 벽돌 안뚫은 애 방문여부, [N][M][1] : 벽돌 뚫은 애 방문여부
	
	static int[] nArray = {-1, 1, 0, 0};
	static int[] mArray = {0, 0, -1, 1};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		isVisited = new boolean[N][M][2];

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(input.charAt(j) + "");
			}
		}
		
		bfs();
		
		if(map[N-1][M-1] == 0) System.out.println(-1);
	}

	// bfs
	public static void bfs() {
		Queue<Place> q = new LinkedList<>();
		Place p = new Place(0, 0, 1, 0);
		isVisited[0][0][0] = true;
		isVisited[0][0][1] = true;
		q.offer(p);
		
		while(!q.isEmpty()) {
			Place motherPlace = q.poll();
			
			if(motherPlace.n == N-1 && motherPlace.m == M-1) {
				map[N-1][M-1] = motherPlace.distance;
				System.out.println(motherPlace.distance);
				return;
			}
			
			for (int i = 0; i < 4; i++) {
				
				int childN = motherPlace.n + nArray[i];
				int childM = motherPlace.m + mArray[i];
				
				if(childN < 0 || childM < 0 || childN >= N || childM >= M) continue;
				
				if(map[childN][childM] == 1) {
					if(motherPlace.drillUsageCount == 0 && !isVisited[childN][childM][1]) {
						isVisited[childN][childM][0] = true;
						isVisited[childN][childM][1] = true;
						q.offer(new Place(childN, childM, motherPlace.distance + 1, 1));
						
					}
				}else {
					if(!isVisited[childN][childM][motherPlace.drillUsageCount]) {
						isVisited[childN][childM][motherPlace.drillUsageCount] = true;
						q.offer(new Place(childN, childM, motherPlace.distance +1, motherPlace.drillUsageCount));
					}
				}
			
			}
					
		}
		
		
	}
}