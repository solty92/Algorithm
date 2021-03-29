package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW1211 {

	static int[][] ladderMap;
	static boolean[][] isVisited;
	static final int MAX = 100;
	static int minCount;
	static int bestStartPoint;
	
	static int[] rowArr = {0, 0, 1};
	static int[] colArr = {-1, 1, 0};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		Player player;

		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			
			ladderMap = new int[MAX][MAX];
			isVisited = new boolean[MAX][MAX];
			minCount = Integer.MAX_VALUE;
			
			// 사다리 그리기 
			for (int row = 0; row < MAX; row++) {
				
				st = new StringTokenizer(br.readLine());
				
				for (int column = 0; column < MAX; column++) {
					
					ladderMap[row][column] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 각 출발점에서 출발
			for (int startColumn = 0; startColumn < MAX; startColumn++) {
				if(ladderMap[0][startColumn] == 1) {
					isVisited = new boolean[MAX][MAX];
					player = new Player(startColumn, 0, startColumn, 0);
					dfs(player);
				}
				
			}
			
			bw.write("#" + testCase + " " + bestStartPoint + "\n");
			
		}
		
		

		bw.close();
	}

	
	public static void dfs(Player player) {
		isVisited[player.myRowPosition][player.myColPosition] = true;
		player.myCount++;
		
		// 마지막 행에 도착했어? 
		if(player.myRowPosition == 99) {
			if(player.myCount <= minCount) {
				minCount = player.myCount;
				bestStartPoint = player.myStartPoint;
				return;
			}else return;
		}
		
		
		
		for (int i = 0; i < 3; i++) {
			int nextRow = player.myRowPosition + rowArr[i];
			int nextCol = player.myColPosition + colArr[i];
			
			if(nextRow >= 0 && nextCol >= 0 && nextRow < MAX && nextCol < MAX && ladderMap[nextRow][nextCol] == 1 && !isVisited[nextRow][nextCol]) {
				player.myRowPosition = nextRow;
				player.myColPosition = nextCol;
				dfs(player);
				break;
			}
			
		}
	}
	
	static class Player {
		int myStartPoint;
		int myRowPosition;
		int myColPosition;
		int myCount;
		
		Player(int myStartPoint, int myRowPosition, int myColPosition, int myCount) {
			this.myStartPoint = myStartPoint;
			this.myRowPosition = myRowPosition;
			this.myColPosition = myColPosition;
			this.myCount = myCount;
		}
		
	}

}