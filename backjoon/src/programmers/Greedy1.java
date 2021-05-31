package programmers;

class Greedy1 {
    public int solution(int n, int[] lost, int[] reserve) {
    	
    	int answer = 0;
    	
    	int[] countArr = new int[n + 2];
    	for (int i = 1; i < countArr.length - 1; i++) {
			countArr[i] = 1;
		}
    	
    	for(int a : lost) {
    		countArr[a]--;
    	}
    	
    	for(int a : reserve) {
    		countArr[a]++;
    	}
    	
    	for (int i = 1; i < countArr.length - 1; i++) {
			
    		if(countArr[i] == 0) {
    			
    			if(countArr[i-1] == 2) {
    				countArr[i-1]--;
    				countArr[i]++;
    				continue;
    			}else if(countArr[i+1] == 2) {
    				countArr[i+1]--;
    				countArr[i]++;
    				continue;
    			}
    			
    		}
		}
    	
    	for(int a : countArr) {
    		if(a > 0) answer++;
    	}
    	
        return answer;
    }
}