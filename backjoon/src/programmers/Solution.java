package programmers;

class Solution {
    public static int solution(String name) {

    	int answer = 0;
    	
    	int lnth = name.length();
    	
    	String str = "";
    	for (int i = 0; i < lnth; i++) {
			str += "A";
		}
    	
    	int a, b;
    	for (int i = 0; i < lnth; i++) {
    		a = (name.charAt(i) - str.charAt(i));
    		b = Math.abs(a - 26);
    		
			answer += a < b ? a : b;
		}
    	
    	// 좌우로 움직이는 횟수
    	// 좌에서 우로 움직일 때
    	int LtoR = 0;
    	for (int i = lnth - 1; i > 0; i--) {
			if(name.charAt(i) != 'A') {
				LtoR = i;
				break;
			}
		}
    	
    	// 우에서 좌로
    	int RtoL = 0;
    	for (int i = 1; i < lnth; i++) {
    		if(name.charAt(i) != 'A') {
				RtoL = lnth - i;
				break;
			}
		}

    	answer += LtoR < RtoL ? LtoR : RtoL;
    	
        return answer;
        
    }
    
    public static void main(String[] args) {
		System.out.println(solution("JAJAAAJ"));
	}
}