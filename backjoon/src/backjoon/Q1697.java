package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {
	
	static int N, K;
	static int[] line = new int[100001];
	static boolean[] isVisited = new boolean[100001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		bfs();
		
		bw.write(line[K] + "");
		
		bw.close();
	}
	
	// bfs
	public static void bfs() {
		line[N] = 0;
		isVisited[N] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(N);
		
		while(!q.isEmpty()) {
			int motherPoint = q.poll();
			
			int forward = motherPoint + 1;
			int backward = motherPoint - 1;
			int teleport = motherPoint * 2;
			
			int[] possibleDestination = new int[] {forward, backward, teleport};
			
			for (int i = 0; i < possibleDestination.length; i++) {
				
				int newPoint = possibleDestination[i];
				if(newPoint >= 0 && newPoint < 100001 && !isVisited[newPoint]) {
					
					line[newPoint] = line[motherPoint] + 1;
					isVisited[newPoint] = true;
					q.offer(newPoint);
				}
				
				if(newPoint == K) return;
			}
		}
	}
}