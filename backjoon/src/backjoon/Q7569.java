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

public class Q7569 {
	static int N, M, H;
	static int[][][] boxMap;
	static boolean[][][] isRipe;
	static ArrayList<int[]> startPoint = new ArrayList<int[]>();
	static int[] hArray = {0, 0, 0, 0, 1, -1};
	static int[] nArray = {-1, 0, 1, 0, 0, 0};
	static int[] mArray = {0, 1, 0, -1, 0, 0};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		boxMap = new int[H][N][M];
		isRipe = new boolean[H][N][M];
		
		boolean isAllRipe = true;
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int j2 = 0; j2 < M; j2++) {
					
					int value = Integer.parseInt(st.nextToken());
					boxMap[i][j][j2] = value;
					
					if(value == 0) isAllRipe = false;
					if(value == 1) {
						isRipe[i][j][j2] = true; 
						startPoint.add(new int[] {i, j, j2});
					}
				}
			}
		}
		
		
		if(isAllRipe) {
			bw.write(0 + "");
			bw.close();
			return;
		}
		
		bfs();
		
		
		boolean isZeroExist = false;
		int result = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					
					if(boxMap[i][j][j2] == 0) isZeroExist = true;
					if(boxMap[i][j][j2] > result) result = boxMap[i][j][j2];
					
				}
			}
		}
		
		if(isZeroExist) {
			bw.write(-1 + "");
		}else {
			bw.write(result - 1 + "");
		}
		
		bw.close();
	}

	// bfs
	public static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		
		for (int i = 0; i < startPoint.size(); i++) {
			int[] start = startPoint.get(i);
			q.offer(start);
		}
		
		while(!q.isEmpty()) {
			int[] motherPoint = q.poll();

			for (int i = 0; i < 6; i++) {
				int childH = motherPoint[0] + hArray[i];
				int childN = motherPoint[1] + nArray[i];
				int childM = motherPoint[2] + mArray[i];
				
				if(childH >=0 && childN >=0 && childM >=0 && childH < H && childN < N && childM < M) {
					if(boxMap[childH][childN][childM] != -1 && !isRipe[childH][childN][childM]) {
						
						boxMap[childH][childN][childM] = boxMap[motherPoint[0]][motherPoint[1]][motherPoint[2]] + 1;
						isRipe[childH][childN][childM] = true;
						
						q.offer(new int[] {childH, childN, childM});
					}
				}
			}
			
			
			
		}
	}
}