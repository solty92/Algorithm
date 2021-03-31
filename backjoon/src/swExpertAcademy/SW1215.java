package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SW1215 {
	
	static int letterLength;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[][] board;

		for (int testCase = 1; testCase <= 10; testCase++) {

			board = new String[8][8];

			letterLength = Integer.parseInt(br.readLine());

			String[] rowTest = new String[letterLength];
			String[] colTest = new String[letterLength];

			for (int row = 0; row < 8; row++) {
				board[row] = br.readLine().split("");
			}

			int count = 0;

			// 가로 검사
			for (int row = 0; row < 8; row++) {
				for (int column = 0; column < 8 - (letterLength - 1); column++) {
					
					int n = row;
					int m = column;

					// 가로검사
					for (int i = 0; i < letterLength; i++) rowTest[i] = board[n][m++];

					if (isRowPalindrome(rowTest)) count++;
				}
			}
			
			// 세로 검사 
			for (int row = 0; row < 8 - (letterLength - 1); row++) {
				for (int column = 0; column < 8; column++) {
					
					int n = row;
					int m = column;
					
					// 세로검사
					for (int i = 0; i < letterLength; i++) colTest[i] = board[n++][m];

					if (isColPalindrome(colTest)) count++;
				}
				
			}

			bw.write("#" + testCase + " " + count + "\n");

		}

		bw.close();
	}

	private static boolean isRowPalindrome(String[] rowTest) {
		
		boolean isPalindrome = true;

		for (int i = 0; i < letterLength / 2; i++) {

			if (!rowTest[i].equals(rowTest[letterLength - 1 - i])) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	private static boolean isColPalindrome(String[] colTest) {
		
		boolean isPalindrome = true;

		for (int i = 0; i < letterLength / 2; i++) {

			if (!colTest[i].equals(colTest[letterLength - 1 - i])) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

}