package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int edge;
	static int[] startPoint = new int[2];
	static int[] destination = new int[2];
	static int[][] chessboard;
	static boolean[][] isVisited;
	static int[] rowArr = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int[] columnArr = {1, 2, 2, 1, -1, -2, -2, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < testCase; i++) {
			edge = Integer.parseInt(br.readLine());
			chessboard = new int[edge][edge];
			
			st = new StringTokenizer(br.readLine());
			startPoint[0] = Integer.parseInt(st.nextToken());
			startPoint[1] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			destination[0] = Integer.parseInt(st.nextToken());
			destination[1] = Integer.parseInt(st.nextToken());
			
			bfs();
		}
		
		
		bw.close();
		
	}
	
	public static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		isVisited[startPoint[0]][startPoint[1]] = true;
		chessboard[startPoint[0]][startPoint[1]] = 0;
		q.offer(new int[] {startPoint[0], startPoint[1]});
		
		while(!q.isEmpty()) {
			int[] motherPoint = q.poll();
			
			for (int i = 0; i < 8; i++) {
				int rowChildPoint = motherPoint[0] + rowArr[i];
				int columnChildPoint = motherPoint[1] + columnArr[i];
				
				if(rowChildPoint >= 0 && columnChildPoint >= 0 && rowChildPoint < edge && columnChildPoint < edge && !isVisited[rowChildPoint][columnChildPoint]) {
					isVisited[rowChildPoint][columnChildPoint] = true;
					chessboard[rowChildPoint][columnChildPoint] = chessboard[motherPoint[0]][motherPoint[1]];
					
				}
			}
			
		}
		
	}
	
}