package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class SW1216 {
	
	static String[][] board;
	static int longestPalindrome;
	static final int MAX = 100;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			
			board = new String[MAX][MAX];
			longestPalindrome = 1;
			
			// 판 만들기 
			for (int j = 0; j < MAX; j++) {
				board[j] = br.readLine().split("");
			}
			
			// 가로로 가장 긴 회문 찾기
			for (int row = 0; row < MAX; row++) {
				for (int col = 0; col < 99; col++) {
					rowPalindromeFinder(row, col);
				}
			}
			
			// 세로로 가장 긴 회문 찾기
			for (int row = 0; row < 99; row++) {
				for (int col = 0; col < MAX; col++) {
					colPalindromeFinder(row, col);
				}
			}
			
			bw.write("#" + testCase + " " + longestPalindrome + "\n");
		}

		bw.close();
	}
	
	private static void rowPalindromeFinder(int row, int col) {
		
		// 이 위치에서 가능한 가장 긴 길
		int possibleLongestLength = MAX - col;
		
		// 그 길이가 현재 찾은 최대회문길이보다 작다면 리턴 
		if(possibleLongestLength <= longestPalindrome) return;
		
		ArrayList<String> checkArr = new ArrayList<String>();
		
		// 체크할 회문 입력 
		for (int i = 0; i < possibleLongestLength; i++) {
			checkArr.add(board[row][col++]);
		}
		
		boolean isPalindrome;
		
		// 회문여부 체크 
		while(possibleLongestLength > longestPalindrome) {

			isPalindrome = true;
			
			for (int i = 0; i < possibleLongestLength / 2; i++) {
				
				if(!checkArr.get(i).equals(checkArr.get(possibleLongestLength - i - 1))) {
					isPalindrome = false;
					break;
				}
			}

			if(isPalindrome) {
				longestPalindrome = possibleLongestLength;
				return;
			}
			
			checkArr.remove(checkArr.size() -1);
			possibleLongestLength--;
		}
		
		
		
		
	}
	
	private static void colPalindromeFinder(int row, int col) {
		
		// 이 위치에서 가능한 가장 긴 길
		int possibleLongestLength = MAX - row;
		
		// 그 길이가 현재 찾은 최대회문길이보다 작다면 리턴 
		if(possibleLongestLength <= longestPalindrome) return;
		
		ArrayList<String> checkArr = new ArrayList<String>();
		
		// 체크할 회문 입력 
		for (int i = 0; i < possibleLongestLength; i++) {
			checkArr.add(board[row++][col]);
		}
		
		boolean isPalindrome;
		
		// 회문여부 체크 
		while(possibleLongestLength > longestPalindrome) {

			isPalindrome = true;
			
			for (int i = 0; i < possibleLongestLength / 2; i++) {
				
				if(!checkArr.get(i).equals(checkArr.get(possibleLongestLength - i - 1))) {
					isPalindrome = false;
					break;
				}
			}

			if(isPalindrome) {
				longestPalindrome = possibleLongestLength;
				return;
			}
			
			checkArr.remove(checkArr.size() -1);
			possibleLongestLength--;
		}

	}
}