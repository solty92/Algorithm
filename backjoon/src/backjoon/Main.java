package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
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
		
		// 2진수의 각자리 값을 십진수로 변환 
		long[] arr = new long[sb.length()];
		int doubling = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = (sb.charAt(i) - 48) * doubling;
			doubling *= 2;
		}

		System.out.println(Arrays.toString(arr));
		
		StringBuffer result = new StringBuffer("");
		
		// 2진수를 3자리씩 잘라서 8진수로 표현 
		int tmp = 0;
		// 1의 자리 
		for (int i = arr.length - 1; i >= arr.length - 3; i--) {
			tmp += arr[i];
		}
		
		result.append(tmp);
		
		// 2의 자리 이상
		int idx = arr.length - 4;
		long octal = 8;
		while(idx >= 0) {
			tmp = 0;

			for (int i = 0; i < 3; i++) {
				tmp += arr[idx--];
			}
			
			result.insert(0, tmp / octal);
			octal *= 8;
			
		}
		
		bw.write(result + "");
		
		bw.close();
	}
}