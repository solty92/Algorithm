package programmers;

import java.util.Stack;

public class S2CodeChallenge2 {
	
	public static int solution(String s) {
        StringBuffer sb = new StringBuffer(s);
        Stack<Character> stack = new Stack<Character>();
        
        int answer = 0;
        
        for(int j = 0 ; j < s.length(); j++) {
        	
        	stack.clear();
        	stack.push('*');
         
            for (int i = 0; i < s.length(); i++) {
                char tmp = sb.charAt(i);
                
                if(tmp == '(' || tmp == '{' || tmp == '[') stack.push(tmp);
                else if(tmp == ')' && stack.peek() == '(') stack.pop();
                else if(tmp == '}' && stack.peek() == '{') stack.pop();
                else if(tmp == ']' && stack.peek() == '[') stack.pop();
                else {
                	stack.clear();
                	break;
                }
                
            }
            
            if(stack.size() == 1) answer++;
            
            char ttmp = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ttmp);
            
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String st = "[](){}"	;
		System.out.println(solution(st));
		
	}
}