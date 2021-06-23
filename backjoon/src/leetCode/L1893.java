package leetCode;

class L1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
    	boolean[] isCovered = new boolean[right + 1];
    	
    	int start, end;
    	for(int[] a : ranges) {
    		start = a[0];
    		end = a[1];
    		
    		if(end > right) end = right;
    		
    		for (int i = start; i <= end; i++) {
				isCovered[i] = true;
			}
    	}
    	
    	for (int i = left; i <= right; i++) {
			
    		if(!isCovered[i]) return false;
    		
		}
    	
    	return true;
    }
}