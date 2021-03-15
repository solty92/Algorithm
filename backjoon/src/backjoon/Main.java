package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static class Place {
		int n;
		int m;
		int distance;
		boolean isDrillUsed;
		
		public Place(int n, int m, int distance, boolean isDrillUsed) {
			this.n = n;
			this.m = m;
			this.distance = distance;
			this.isDrillUsed = isDrillUsed;
		}
	}

	static int N, M, result;
	static int[][] map;
	static boolean[][][] isVisited;	//[N][M][0] : 벽돌 안뚫은 애 방문여부, [N][M][1] : 벽돌 뚫은 애 방문여부
	
	static int[] nArray = {-1, 1, 0, 0};
	static int[] mArray = {0, 0, -1, 1};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
		
		System.out.println(Arrays.deepToString(map));
		System.out.println(Arrays.deepToString(isVisited));

		bw.close();
	}

	// bfs
	public static void bfs() {
	}
}