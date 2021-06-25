package leetCode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
    	boolean isUniversal;
    	List<String> list = new ArrayList<String>();
    	
    	for(String a : words1) {
    		isUniversal = true;
    		
    		for(String b : words2) {
    			
    			isUniversal = subsetCheck(a, b);
    			if(!isUniversal) break;
    		}
    		
    		if(isUniversal) {
    			list.add(a);
    		}
    	}
    	
    	return list;
    }

	private boolean subsetCheck(String a, String b) {

		StringBuffer sb = new StringBuffer(a);
		
		char c;
		int tmp;
		for (int i = 0; i < b.length(); i++) {
			c = b.charAt(i);
			
			tmp = sb.indexOf(c + "");
			if(tmp != -1) {
				sb.deleteCharAt(tmp);
			}else return false;
		}
		
		return true;
	}

}