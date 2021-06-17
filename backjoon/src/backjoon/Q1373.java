package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1373 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuffer sb = new StringBuffer(br.readLine());
		
		// 입력값을 3배수의 자리수로 변환 
		while(true) {
			
			if(sb.length() % 3 != 0) {
				sb.insert(0, '0');
			}else break;
			
		}
		
		StringBuffer result = new StringBuffer("");
		// 2진수를 3자리씩 잘라서 8진수로 표현 (첫번째 자리 : 4, 두번째 자리 : 2, 세번째 자리 1)
		int[] arr = {4, 2, 1};
		int tmpSum;
		
		for (int i = 0; i < sb.length(); i+=3) {
			tmpSum = 0;
			
			if(sb.charAt(i) == '1') {
				tmpSum += arr[0];
			}
			if(sb.charAt(i+1) == '1') {
				tmpSum += arr[1];
			}
			if(sb.charAt(i+2) == '1') {
				tmpSum += arr[2];
			}
			
			result.append(tmpSum);
		}
		
		
		
		bw.write(result + "");
		
		bw.close();
	}
}