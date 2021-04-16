package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class SW1224 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> st = new Stack<Character>();
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			st.clear();
			int arrLength = Integer.parseInt(br.readLine());
			
			ArrayList<Character> postfix = new ArrayList<Character>();
			
			// 후위 표기식으로 변환 
			String inpt = br.readLine();
			for (int i = 0; i < arrLength; i++) {
				
				if(inpt.charAt(i) == '(') st.push('(');
				else if(inpt.charAt(i) == ')') {
					while(st.peek() != '(') {
						postfix.add(st.pop());
					}
					st.pop();
					
				}else if(inpt.charAt(i) == '+') {
					
					if(st.peek() == '*') {
						while(st.peek() == '*') {
							postfix.add(st.pop());
						}
					}
					
					st.push('+');
				}
				else if(inpt.charAt(i) == '*') st.push('*');
				else postfix.add(inpt.charAt(i));
				
			}
			
			// 계산 
			Stack<Integer> cal = new Stack<Integer>();
			for(char a : postfix) {
				
				if(a == '*') {
					int bb = cal.pop();
					int aa = cal.pop();
					
					cal.push(aa * bb);
				}else if(a == '+') {
					int bb = cal.pop();
					int aa = cal.pop();
					
					cal.push(aa + bb);
				}else cal.push(Integer.parseInt(a + ""));
			}
			
			int answer = cal.pop();
			
			bw.write("#" + testCase + " " + answer + "\n");
		}
		
		bw.close();
		
	}
}