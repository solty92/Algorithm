package leetCode;

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
    	
    	int x = mat[0].length;
    	int y = mat.length;
    	
    	int maxSideLength = x < y ? x : y;

    	loop : while(maxSideLength > 0) {
    		for (int row = 0; row <= y - maxSideLength; row++) {
				
    			for (int col = 0; col <= x - maxSideLength; col++) {
					
    				if(squareSum(row, col, maxSideLength, mat, threshold)) break loop;
    				
				}
			}
    		
    		maxSideLength--;
    	}

    	return maxSideLength;
        
    }
    
    private boolean squareSum(int row, int col, int maxSideLength, int[][] mat, int threshold) {

    	int sum = 0;
    	
    	for (int y = row; y < row + maxSideLength; y++) {
			for (int x = col; x < col + maxSideLength; x++) {
				sum += mat[y][x];
				if(sum > threshold) return false;
			}
		}
    	
    	return true;
	}
}