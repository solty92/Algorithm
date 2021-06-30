package leetCode;

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
    	
    	int ans = 0;
    	
    	int x = mat[0].length;
    	int y = mat.length;
    	
    	int maxSideLength = x < y ? x : y;

    	while(maxSideLength > 0) {
    		
    		for (int row = 0; row <= y - maxSideLength; row++) {
				
    			for (int col = 0; col <= x - maxSideLength; col++) {
					
    				
    				
				}
			}
    		
    		maxSideLength--;
    	}
    	
    	return ans;
        
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[][] mat = {{1,1,1,1},{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0}};
		
		sol.maxSideLength(mat, 6);
	}
}