package leetCode;

class L1492 {
    public int kthFactor(int n, int k) {
        
    	int kth = 0;
    	
    	for (int i = 1; i <= n; i++) {

    		if(n % i == 0) {
    			kth++;
    		}
    		
    		if(k == kth) return i;
    		
		}
    	
    	return -1;
    }
}