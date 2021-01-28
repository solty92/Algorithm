package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inpt = br.readLine();
		
		char[] address = inpt.toCharArray();
		
		int result = 0;
		
		for (int i = 0; i < address.length; i++) {
			result += timeCal(address[i]);
		}
		bw.write(result+"");
		
		bw.flush();
		bw.close();
		
	}
	
	public static int timeCal(char c) {
		
		switch((int)c) {
			case 65:
			case 66:
			case 67:
				return 3;
			case 68:
			case 69:
			case 70:
				return 4;
			case 71:
			case 72:
			case 73:
				return 5;
			case 74:
			case 75:
			case 76:
				return 6;
			case 77:
			case 78:
			case 79:
				return 7;
			case 80:
			case 81:
			case 82:
			case 83:
				return 8;
			case 84:
			case 85:
			case 86:
				return 9;
			case 87:
			case 88:
			case 89:
			case 90:
				return 10;
		}
		
		return 0;
		
	}
	
}