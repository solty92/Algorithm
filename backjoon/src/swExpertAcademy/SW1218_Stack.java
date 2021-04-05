package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class SW1218_Stack {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<Character>();
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			stack.clear();
			
			int n = Integer.parseInt(br.readLine());
			
			String inpt = br.readLine();
			
			for (int i = 0; i < n; i++) {
				char tmp = inpt.charAt(i);
				
				if(tmp == '(' || tmp == '{' || tmp == '[' || tmp == '<') stack.push(tmp);
				else if(tmp == ')' && stack.peek() == '(') stack.pop();
				else if(tmp == '}' && stack.peek() == '{') stack.pop();
				else if(tmp == ']' && stack.peek() == '[') stack.pop();
				else if(tmp == '>' && stack.peek() == '<') stack.pop();
				else break;
			}
		
			int result = stack.isEmpty() ? 1 : 0;
			
			
			bw.write("#" + testCase + " " + result + "\n");
		}
		
		bw.close();
	}
}