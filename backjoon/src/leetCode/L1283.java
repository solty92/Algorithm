package leetCode;

class L1283 {
    public int smallestDivisor(int[] nums, int threshold) {
    	
    	int low = 1;
    	int mid = 0;
    	int high = 1000000;
    	
    	int sumDivision;
    	int divisor = 1000000;
    	
    	while(low <= high) {
    		mid = (high + low) / 2;
    		
    		sumDivision = 0;
    		for (int i = 0; i < nums.length; i++) {
				sumDivision += Math.ceil((double)nums[i]/mid);
			}
    		
    		if(sumDivision > threshold) {
    			low = mid + 1;
    		}else {
    			high = mid - 1;
    			divisor = divisor > mid ? mid : divisor;
    		}
    	}
    	
    	return divisor;
    }
}