package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] WB = {"W", "B", "W", "B", "W", "B", "W", "B"};
		String[] BW = {"B", "W", "B", "W", "B", "W", "B", "W"};

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		
		String[][] chessboard = new String[x][y];
		
		for (int i = 0; i < chessboard.length; i++) {
			chessboard[i] = br.readLine().split("");
		}
		
		int xStartCount = x - 7;
		int yStartCount = y - 7;

		int count = 2500;
		for (int ii = 0; ii < xStartCount; ii++) {
			for (int jj = 0; jj < yStartCount; jj++) {
				
				int tmp = 0;
				
				for (int i = ii; i < ii+8; i+=2) {
					for (int j = jj; j < jj+8; j++) {
						if(!chessboard[i][j].equals(WB[j-jj])) tmp++;
					}
				}
				
				for (int i = ii+1; i < ii+8; i+=2) {
					for (int j = jj; j < jj+8; j++) {
						if(!chessboard[i][j].equals(BW[j-jj])) tmp++;
						
					}
				}
					
				
				if(tmp < count) count = tmp;
				tmp = 0;
				
				
				for (int i = ii; i < ii+8; i+=2) {
					for (int j = jj; j < jj+8; j++) {
						if(!chessboard[i][j].equals(BW[j-jj])) tmp++;
					}
				}
				
				for (int i = ii+1; i < ii+8; i+=2) {
					for (int j = jj; j < jj+8; j++) {
						if(!chessboard[i][j].equals(WB[j-jj])) tmp++;
						
					}
				}
				
				if(tmp < count) count = tmp;
			}
		}
		
		bw.write("" + count);
		bw.close();
	}
}