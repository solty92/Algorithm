package etc;

class CodeChallenge6 {
	
	static StringBuffer binarySt;
	
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        int idx = 0;
        for (int i = 0; i < numbers.length; i++) {
			
        	binarySt = new StringBuffer(Long.toBinaryString(numbers[i]));
        	
        	long tmp = leastDiffentNumb();
        	answer[idx++] = tmp;
		}
        
        return answer;
    }
    
    private long leastDiffentNumb() {

    	int idx = -1;
    	
    	// 가장 가까운 0 찾기 
    	for (int i = binarySt.length() - 1; i >= 0; i--) {
			
    		if(binarySt.charAt(i) == '0') {
    			idx = i;
    			break;
    		}
		}
    	
    	if(idx == binarySt.length() - 1) {
    		binarySt.deleteCharAt(idx);
    		binarySt.append('1');
    	}else if(idx == -1) {
    		binarySt.replace(0, 1, "10");
    	}else {
    		binarySt.replace(idx, idx+2, "10");
    	}
    	
    	String tmp = binarySt.toString();
    	
    	
    	
    	return Long.parseLong(tmp, 2);
	}
}