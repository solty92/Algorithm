package leetCode;

import java.util.Arrays;

class L1619 {
    public double trimMean(int[] arr) {
    	
    	double ans = 0;
    	
    	Arrays.sort(arr);
    	
    	int fiveP = arr.length / 20;
    	System.out.println(fiveP);
    	
    	for (int i = fiveP; i < arr.length - fiveP; i++) {
			ans += arr[i];
		}
    	
    	ans /= arr.length - (fiveP * 2);
    	
    	
    	return ans;
        
    }
}