package leetCode;

class L503 {
	
    public int[] nextGreaterElements(int[] nums) {

    	int[] answer = new int[nums.length];
    	
    	int tmp, current;
    	boolean isFound;
    	for (int i = 0; i < nums.length; i++) {
			tmp = -1;
			isFound = false;
			
			current = nums[i];
			
			for (int j = i+1; j < answer.length; j++) {
				
				if(nums[j] > current) {
					isFound = true;
					tmp = nums[j];
					break;
				}
			}

			if(!isFound) {
				
				for (int j = 0; j < i; j++) {
					
					if(nums[j] > current) {
						isFound = true;
						tmp = nums[j];
						break;
					}
				}
			}
			
    		
    		answer[i] = tmp; 
		}
    	
    	
    	
    	return answer;
    }
}