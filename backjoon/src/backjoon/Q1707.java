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

public class Q1707 {
	
	static int V, E;
	static ArrayList<ArrayList<Integer>> connection = new ArrayList<ArrayList<Integer>>();
	static boolean[] TrueOrFalse, isVisited;
	static boolean result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			
			result = true;
			TrueOrFalse = new boolean[V+1];
			isVisited = new boolean[V+1];
			for (int j = 0; j < V+1; j++) {
				connection.add(new ArrayList<Integer>());
			}
			
			
			// 점과 점 이어주기
			for (int j = 0; j < E; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				connection.get(a).add(b);
				connection.get(b).add(a);
			}
			
			
			
			for (int j = 1; j < connection.size(); j++) {
				if(!isVisited[j]) bfs(j);
			}
			
			if(result) bw.write("YES\n");
			else bw.write("NO\n");

			
			connection.clear();
		}
		
		
		bw.close();
		
	}
	
	// bfs
	public static void bfs(int startVertex) {
		Queue<Integer> q = new LinkedList<Integer>();
		isVisited[startVertex] = true;
		q.offer(startVertex);
		
		while(!q.isEmpty()) {
			int motherVertex = q.poll();
			
			for (int i = 0; i < connection.get(motherVertex).size(); i++) {
				int childVertex = connection.get(motherVertex).get(i);
				
				if(isVisited[childVertex] && TrueOrFalse[childVertex] == TrueOrFalse[motherVertex]) {
					result = false;
					return;
				}
				
				if(!isVisited[childVertex]) {
					isVisited[childVertex] = true;
					TrueOrFalse[childVertex] = !TrueOrFalse[motherVertex];
					q.offer(childVertex);
				}
				
			}
		}
		
	}
	
}