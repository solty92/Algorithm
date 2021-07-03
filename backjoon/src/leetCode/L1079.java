package leetCode;

class L1079 {
	
	static int[] alphArr;
	static int ans;
	
    public int numTilePossibilities(String tiles) {
        
    	int maxRank = tiles.length();
    	
    	alphArr = new int[26];
    	
    	// 알파벳 개수 카운트 
    	for (int i = 0; i < maxRank; i++) {
			alphArr[tiles.charAt(i) - 'A']++;
		}

    	ans = 0;
    	
    	bt();
    	
    	return ans;
    }
    
    private void bt() {
    	
    	for (int i = 0; i < alphArr.length; i++) {
			
    		if(alphArr[i] > 0) {
    			alphArr[i]--;
    			ans++;
    			bt();
    			alphArr[i]++;
    		}
		}

		
	}
}