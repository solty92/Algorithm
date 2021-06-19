package leetCode;

import java.util.ArrayList;
import java.util.List;

class L442 {
    public List<Integer> findDuplicates(int[] nums) {
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	boolean[] isDeleted = new boolean[nums.length + 1];
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		if(!isDeleted[nums[i]]) {
    			isDeleted[nums[i]] = true;
    		}else {
    			list.add(nums[i]);
    		}
    		
		}
    	
    	
		return list;
        
    }
}