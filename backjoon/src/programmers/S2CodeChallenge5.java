package programmers;

class S2CodeChallenge5 {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
			
        	int count = divisorCounter(i);
        	
        	if(count % 2 == 0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        	
		}
        System.out.println(answer);
        return answer;
    }
    
    public int divisorCounter(int number) {
    	int count = 0;
    	
    	for (int i = number; i > 1; i--) {
    		
			if(number % i == 0) {
				count++;
			}
		}
    	
    	return count + 1;
    }
    
}