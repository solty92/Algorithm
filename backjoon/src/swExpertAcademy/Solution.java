package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	
	static int[] arr;
	static int lvl;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		lvl = 0;
		while(N > Math.pow(2, lvl)) {
			
			lvl++;
			
		}
		
		int childeNodes = (int) Math.pow(2, lvl);
		arr = new int[childeNodes * 2];
		
		for (int i = childeNodes; i < childeNodes + N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		// 조상 노드 채우기
		int tmpLvl = lvl;
		while(tmpLvl > 0) {
			
			for (int i = (int) Math.pow(2, tmpLvl); i < (int) Math.pow(2, tmpLvl) * 2; i += 2) {
				
				arr[i/2] = arr[i] + arr[i+1];
				
			}
			
			tmpLvl--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < M+K; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int which = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(which == 1) change(a - 1 + childeNodes, b);
			else sum(a - 1 + childeNodes, b - 1 + childeNodes);
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		bw.close();
	}
	
	private static void change(int changeThis, int toThis) {
		
		int difference = toThis - arr[changeThis];
		arr[changeThis] = toThis;
		
		int tmpLvl = lvl;
		
		while(tmpLvl > 0) {
			
			if(changeThis % 2 == 0) {
				changeThis /= 2;
				arr[changeThis] += difference;
			}else {
				changeThis -= 1;
				changeThis /= 2;
				arr[changeThis] += difference;
			}
			
			tmpLvl--;
			
		}
		
	}
	
	private static void sum(int from, int to) throws IOException {
		
		int result = 0;
		
		if(from == to) {
			bw.write(arr[from] + "\n");
			return;
		}
		
		if(from % 2 != 0) {
			result += arr[from];
			from++;
		}
		
		if(to % 2 == 0) {
			result += arr[to];
			to--;
		}
		
		int leftIdx = from;
		int rightIdx = to;
		
		while(leftIdx < rightIdx) {
			
		}
		
		
		
	}
}