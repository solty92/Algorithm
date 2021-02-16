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
		
		String[] WB = new String[8];
		for (int i = 0; i < WB.length; i+=2) {
			WB[i] = "W";
		}
		for (int i = 1; i < WB.length; i+=2) {
			WB[i] = "B";
		}
		
		String[] BW = new String[8];
		for (int i = 0; i < BW.length; i+=2) {
			BW[i] = "B";
		}
		for (int i = 1; i < BW.length; i+=2) {
			BW[i] = "W";
		}
		
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
		int tmp = 0;
		for (int ii = 0; ii < xStartCount; ii++) {
			for (int jj = 0; jj < yStartCount; jj++) {
				System.out.println("스타팅 포인트 !!! => i위치 : " + ii + "  j위치 : " + jj);
				
				if(chessboard[ii][jj].equals("W")) {

					for (int i = ii; i < ii+8; i+=2) {
						for (int j = jj; j < jj+8; j++) {
							if(!chessboard[i][j].equals(WB[j])) count++;
						}
					}
					
					for (int i = ii+1; i < ii+7; i+=2) {
						for (int j = jj; j < jj+8; j++) {
							if(!chessboard[i][j].equals(BW[j])) count++;
							
						}
					}
					
				}else {

					for (int i = 0; i < chessboard.length; i+=2) {
						for (int j = 0; j < chessboard.length; j++) {
							if(!chessboard[i][j].equals(BW[j])) count++;
						}
					}
					
					for (int i = 1; i < chessboard.length; i+=2) {
						for (int j = 0; j < chessboard.length; j++) {
							if(!chessboard[i][j].equals(WB[j])) count++;
							
						}
					}
				}
				
				
			}
		}
		
		
		
		
		
		bw.write("" + count);
		bw.close();
		
	}
	
}