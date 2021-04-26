package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2042 {
	
	static long[] arr;
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
		arr = new long[childeNodes * 2];
		
		for (int i = childeNodes; i < childeNodes + N; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		
		// 조상 노드 채우기
		int tmpLvl = lvl;
		while(tmpLvl > 0) {
			
			for (int i = (int) Math.pow(2, tmpLvl); i < (int) Math.pow(2, tmpLvl) * 2; i += 2) {
				
				arr[i/2] = arr[i] + arr[i+1];
				
			}
			
			tmpLvl--;
		}
		
		
		for (int i = 0; i < M+K; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int which = Integer.parseInt(st.nextToken());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
			if(which == 1) change(a - 1 + childeNodes, b);
			else sum(a - 1 + childeNodes, b - 1 + childeNodes);
			
		}
		
		
		bw.close();
	}
	
	private static void change(long changeThis, long toThis) {
		
		long difference = toThis - arr[(int) changeThis];
		arr[(int) changeThis] = toThis;
		
		int tmpLvl = lvl;
		
		while(tmpLvl > 0) {
			
			if(changeThis % 2 == 0) {
				changeThis /= 2;
				arr[(int) changeThis] += difference;
			}else {
				changeThis -= 1;
				changeThis /= 2;
				arr[(int) changeThis] += difference;
			}
			
			tmpLvl--;
			
		}
		
	}
	
	private static void sum(long from, long to) throws IOException {
		
		long result = 0;
		
		if(from == to) {
			bw.write(arr[(int) from] + "\n");
			return;
		}
		
		if(from % 2 != 0) {
			result += arr[(int) from];
			from++;
		}
		
		if(to % 2 == 0) {
			result += arr[(int) to];
			to--;
		}
		
		int leftIdx = (int) from;
		int rightIdx = (int) to;
		
		while(leftIdx < rightIdx) {
			
			if(leftIdx % 2 == 0) {
				leftIdx /= 2;
			}else {
				result += arr[leftIdx];
				leftIdx++;
				
				leftIdx /= 2;
			}
			
			if(rightIdx % 2 != 0) {
				rightIdx--;
				rightIdx /= 2;
			}else {
				result += arr[rightIdx];
				rightIdx -= 2;
				
				rightIdx /= 2;
			}
		}
		
		if(leftIdx == rightIdx) {
			result += arr[leftIdx];
			bw.write(result + "\n");
		}else {
			bw.write(result + "\n");
		}
		
		
		
	}
}