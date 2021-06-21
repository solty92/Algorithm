package leetCode;

import java.util.Arrays;

class L27 {
    public int removeElement(int[] nums, int val) {
    	
    	int k = nums.length;
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		if(nums[i] == val) {
    			nums[i] = 51;
    			k--;
    		}
    		
		}
    	
    	Arrays.sort(nums);
    	
		return k;
        
    }
    
    public static void main(String[] args) {
		L27 sol = new L27();
		System.out.println(sol.removeElement(new int[] {3,2,2,3}, 2));
	}
}