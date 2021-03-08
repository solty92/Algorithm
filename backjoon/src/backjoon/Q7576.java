package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {
	static int[] nArray = { -1, 0, 1, 0 };
	static int[] mArray = { 0, 1, 0, -1 };
	static int[][] boxMap;
	static boolean[][] isRipe;
	static int N, M;
	static ArrayList<int[]> startPoint = new ArrayList<int[]>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		boxMap = new int[N][M];
		isRipe = new boolean[N][M];
		int zeroCount = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int value = Integer.parseInt(st.nextToken());
				boxMap[i][j] = value;
				if (value == 1)
					startPoint.add(new int[] { i, j });
				if (value == 0)
					zeroCount++;
			}
		}

		if (zeroCount == 0) {

			bw.write(0 + "");
			bw.close();
			return;
		}

		
		bfs();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr.add(boxMap[i][j]);
			}
		}

		arr.sort(Comparator.reverseOrder());

		boolean isUnripeExist = arr.contains(0);

		if (isUnripeExist) {
			bw.write(-1 + "");
		} else {
			bw.write(arr.get(0) - 1 + "");
		}

		bw.close();
	}

	// bfs
	public static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		for (int i = 0; i < startPoint.size(); i++) {
			int[] tmp = startPoint.get(i);

			int startN = tmp[0];
			int startM = tmp[1];
			boxMap[startN][startM] = 1;
			isRipe[startN][startM] = true;

			q.offer(new int[] { startN, startM });
		}

		while (!q.isEmpty()) {
			int[] motherPoint = q.poll();

			for (int i = 0; i < 4; i++) {
				int newN = motherPoint[0] + nArray[i];
				int newM = motherPoint[1] + mArray[i];

				if (newN >= 0 && newM >= 0 && newN < N && newM < M && boxMap[newN][newM] != -1 && !isRipe[newN][newM]) {
					if (boxMap[newN][newM] == 0) {

						isRipe[newN][newM] = true;
						boxMap[newN][newM] = boxMap[motherPoint[0]][motherPoint[1]] + 1;
						q.offer(new int[] { newN, newM });
					}

				}
			}
		}

	}
}