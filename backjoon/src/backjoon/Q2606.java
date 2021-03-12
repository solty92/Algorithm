package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {
	
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static boolean[] isVisted;
	static int count = -1 ;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int computerTotal = Integer.parseInt(br.readLine());
		int edgeTotal = Integer.parseInt(br.readLine());
		
		
		isVisted = new boolean[computerTotal + 1];
		
		for (int i = 0; i < computerTotal + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		StringTokenizer st;
		for (int i = 0; i < edgeTotal; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		for ( ArrayList<Integer> a : graph ) {
			a.sort(null);
		}
		
		
		int start = 1;
//		dfs(start);
		bfs(start);
		System.out.println(count);
		
	}
	
	// ±Ì¿Ã
	public static void dfs(int start) {
		isVisted[start] = true;
		count++;
		
		for (int i = 0; i < graph.get(start).size(); i++) {
			int computer = graph.get(start).get(i);
			
			if(!isVisted[computer]) dfs(computer);
				
			
		}
		
	}
	
	// ≥ ∫Ò
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		isVisted[start] = true;
		
		while(!queue.isEmpty()) {
			int computer = queue.poll();
			count++;
			
			for (int i = 0; i < graph.get(computer).size(); i++) {
				int tmp = graph.get(computer).get(i);
				if(!isVisted[tmp]) {
					isVisted[tmp] = true;
					queue.offer(tmp);
				}
				
			}
		}
	}
}