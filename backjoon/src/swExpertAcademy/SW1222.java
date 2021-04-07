package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class SW1222 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		Stack<Integer> stack;
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			
			// 스택에 숫자 넣기 
			stack = new Stack<Integer>();
			st = new StringTokenizer(br.readLine(), "+");

			while(st.hasMoreTokens()) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			
			// 연산하기
			int result = 0;
			while(stack.size() > 1) {
				int b = stack.pop();
				int a = stack.pop();
				
				stack.push(a + b);
			}
			
			bw.write("#" + testCase + " " + stack.pop() + "\n");
		}
		
		bw.close();
	}
}