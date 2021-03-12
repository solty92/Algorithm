package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
	
	static int[][] list;
	static boolean[] isVisited;
	
	static int vertexTotal;
	static int edgeTotal;
	static int start;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		vertexTotal = Integer.parseInt(st.nextToken());		
		edgeTotal = Integer.parseInt(st.nextToken());	
		start = Integer.parseInt(st.nextToken());		
		
		list = new int[vertexTotal+1][vertexTotal+1];
		isVisited = new boolean[vertexTotal+1];
		
		for (int i = 0; i < edgeTotal; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a][b] = list[b][a]	= 1;
		}
		
		
		dfs(start);
		
		System.out.println();
		
		Arrays.fill(isVisited, false);
		bfs(start);
		
	}
	
	// ±íÀÌ¿ì¼±Å½»ö
	public static void dfs(int start) {
		isVisited[start] = true;
		System.out.print(start + " ");
		
		for (int i = 1; i < vertexTotal + 1; i++) {
			if(list[start][i] == 1 && !isVisited[i]) dfs(i);
		}
	}
	
	// ³Êºñ¿ì¼±Å½»ö
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		isVisited[start] = true;
		
		while( !queue.isEmpty() ) {
			int vertex = queue.poll();
			System.out.print(vertex + " ");
			
			for (int i = 1; i < vertexTotal + 1; i++) {
				
				if(list[vertex][i] == 1 && !isVisited[i]) {
					queue.offer(i);
					isVisited[i] = true;
				}
			}
		}
	}

}