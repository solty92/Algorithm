package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SW1218 {
	
	public static boolean isValid;
	public static char[] bracket = {'(', ')', '[', ']', '{', '}', '<', '>'};
	public static char[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int testCase = 1; testCase <= 10; testCase++) {
			isValid = true;
			
			int n = Integer.parseInt(br.readLine());
			
			arr = new char[n];
			
			arr = br.readLine().toCharArray();
			
			for (int i = 0; i < bracket.length - 1; i+=2) {
				check(bracket[i], bracket[i+1]);
				if(!isValid) break;
			}
			
			int result = isValid ? 1 : 0;
			
			bw.write("#" + testCase + " " + result + "\n");
		}
		
		bw.close();
	}
	
	public static void check(char open, char close) {
		int countOpen = 0;
		int countClose = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == open) countOpen++;
			if(arr[i] == close) countClose++;
		}
		
		if(countOpen != countClose) isValid = false;
	}
}