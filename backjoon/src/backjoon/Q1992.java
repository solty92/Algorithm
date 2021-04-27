package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1992 {
	
	static int N;
	static int[][] map;
	static int unity;
	
	static BufferedWriter bw;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String inpt = br.readLine();
			
			for (int j = 0; j < N; j++) {
				map[i][j] = inpt.charAt(j) - 48;
			}
		}
		
		
		dQ(0, 0, N);
		
		bw.close();
	}
	
	private static boolean check(int row, int col, int size) {
		
		int tmp = map[row][col];
		
		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				
				if(map[i][j] != tmp) return false;
				
			}
		}
		
		unity = tmp;
		return true;
	}
	
	private static void dQ(int row, int col, int size) throws IOException {
		
		if(check(row, col, size)) {
			bw.write(unity + "");
		}else {
			bw.write("(");
			
			int newSize = size/2;
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					dQ(row + i*newSize, col + j*newSize, newSize);
				}
			}
			
			bw.write(")");
		}
		
	}
}