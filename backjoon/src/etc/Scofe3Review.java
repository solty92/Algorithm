package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Scofe3Review {
	
	static int[][] arr;
	static boolean[][] isVisited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		isVisited = new boolean[N][N];
		int size1Count = 0;
		int total = 0;
		
		for (int i = 0; i < N; i++) {
			String[] tmpArr = br.readLine().split("");
			
			for (int j = 0; j < N; j++) {
				int value = Integer.parseInt(tmpArr[j]);
				arr[i][j] = value;
				
				if(value == 1) size1Count++;
			}
		}
		total += size1Count;

		// 사이즈 별로 체
		for (int size = 2; size <= N; size++) {
			int count_per_size = 0;
			
			for (int row = 0; row <= N-size; row++) {
				for (int column = 0; column <= N-size; column++) {
					count_per_size += isPossible(row, column, size);
				}
			}
			
			if(count_per_size == 0) break;
			total += count_per_size;
			bw.write("size["+size+"]: " + count_per_size + "\n");
			isVisited = new boolean[N][N];
		}
		
		
		System.out.println("total: " + total);
		System.out.println("size[1]: " + size1Count);
		
		bw.close();
	}
	
	public static int isPossible(int row, int column, int size) {
		// possible : 1,	impossible : 0
		
		if(isVisited[row][column]) return 0;
		
		isVisited[row][column] = true;
		
		for (int i = row; i < row+size; i++) {
			for (int j = column; j < column+size; j++) {
				
				if(arr[i][j] != 1) return 0;
				
			}
		}
		
		
		return 1;
	}
}