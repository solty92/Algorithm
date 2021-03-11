package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[][] map;
	static int[][] tmpMap;
	static boolean[][] isVisted;
	static ArrayList<int[]> wallPoint = new ArrayList<int[]>();
	static ArrayList<Integer> result = new ArrayList<Integer>();
	static int[] nArray = { -1, 0, 1, 0 };
	static int[] mArray = { 0, 1, 0, -1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		tmpMap = new int[N][M];
		isVisted = new boolean[N][M];
		wallPoint.add(new int[] { 0, 0 });

		for (int i = 0; i < N; i++) {
			char[] charArr = br.readLine().toCharArray();

			for (int j = 0; j < M; j++) {

				int value = charArr[j] - '0';
				map[i][j] = value;

				if (value == 1)
					wallPoint.add(new int[] { i, j });
			}
		}
		
		int zeroCount = 0;

		for (int i = 0; i < wallPoint.size(); i++) {
			isVisted = new boolean[N][M];
			int[] destroyWall = wallPoint.get(i);
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					tmpMap[j][j2] = map[j][j2];
				}
			}
			tmpMap[destroyWall[0]][destroyWall[1]] = 0;

			bfs();
			if(tmpMap[N - 1][M - 1] != 0) result.add(tmpMap[N - 1][M - 1]);
			else zeroCount++;
			
			
		}
		
		int answer = N*M;
		if(zeroCount == wallPoint.size()) {
			bw.write(-1 + "");
		}else {
			for (int a : result) {
				if(a < answer) answer = a;
			}
			bw.write(answer + "");
		}
		

		bw.close();
	}

	// bfs
	public static void bfs() {
		tmpMap[0][0] = 1;
		isVisted[0][0] = true;
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] { 0, 0 });

		while (!q.isEmpty()) {
			int[] motherPoint = q.poll();

			for (int i = 0; i < 4; i++) {
				int childN = motherPoint[0] + nArray[i];
				int childM = motherPoint[1] + mArray[i];

				if (childN >= 0 && childM >= 0 && childN < N && childM < M && tmpMap[childN][childM] != 1 && !isVisted[childN][childM]) {

					tmpMap[childN][childM] = tmpMap[motherPoint[0]][motherPoint[1]] + 1;
					isVisted[childN][childM] = true;

					q.offer(new int[] { childN, childM });
				}

			}

		}
	}
}