package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SW1219 {
	
	static ArrayList<Integer>[] map;
	static boolean[] isVisited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			int N = Integer.parseInt(st.nextToken());
			
			isVisited = new boolean[100];
			map = new ArrayList[100];
			for (int i = 0; i < 100; i++) {
				map[i] = new ArrayList<Integer>();
			}
			
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				
				map[from].add(to);
			}

			dfs(0);
			
			if(isVisited[99]) bw.write("#" + testCase + " " + 1 + "\n");
			else bw.write("#" + testCase + " " + 0 + "\n");
		}
		
		bw.close();
	}
	
	public static void dfs(int currentVertex) {
		isVisited[currentVertex] = true;
		
		for (int i = 0; i < map[currentVertex].size(); i++) {
			if(!isVisited[map[currentVertex].get(i)]) dfs(map[currentVertex].get(i));
		}
		
	}
	
}