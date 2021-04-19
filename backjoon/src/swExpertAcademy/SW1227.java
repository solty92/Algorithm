package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class SW1227 {
	
	static final int MAX = 100;
	static int[][] maze;
	static boolean[][] isVisited;
	static boolean isPossible;
	
	static int[] iArr = {-1, 0, 1, 0};
	static int[] jArr = {0, 1, 0, -1};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			
			maze = new int[MAX][MAX];
			isVisited = new boolean[MAX][MAX];
			isPossible = false;
			
			for (int i = 0; i < MAX; i++) {
				String inpt = br.readLine();
				
				for (int j = 0; j < MAX; j++) {
					maze[i][j] = (int) inpt.charAt(j) - 48;
				}
			}
			
			//	출발점 찾아서 시작 
			A : for (int i = 0; i < MAX; i++) {
				for (int j = 0; j < MAX; j++) {
					
					if(maze[i][j] == 2) {
						bfs(i, j);
						break A;
					}
					
				}
			}
			
			int result = isPossible ? 1 : 0;
			bw.write("#" + testCase + " " + result + "\n");
			
			
		}
		
		bw.close();
	}
	
	private static void bfs(int i, int j) {
		
		Queue<int[]> q = new LinkedList<int[]>();
		
		q.add(new int[] {i, j});
		isVisited[i][j] = true;
		
		while(!q.isEmpty()) {
			
			int[] currentPoint = q.poll();
			isVisited[currentPoint[0]][currentPoint[1]] = true;
			if(maze[currentPoint[0]][currentPoint[1]] == 3) {
				isPossible = true;
				return;
			}
				
			
			for (int k = 0; k < 4; k++) {
				
				int newIPoint = currentPoint[0] + iArr[k];
				int newJPoint = currentPoint[1] + jArr[k];
				
				if(newIPoint >= 0 && newJPoint >= 0 && newIPoint < MAX && newJPoint < MAX && !isVisited[newIPoint][newJPoint] && maze[newIPoint][newJPoint] != 1) {
					q.add(new int[] {newIPoint, newJPoint});
				}
				
			}
			
		}
	}
}