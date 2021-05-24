package programmers;

import java.util.HashMap;

class Hash2 {
    public boolean solution(String[] phone_book) {
    	
    	HashMap<String, Integer> hm = new HashMap<String, Integer>();
    	
        for(String a : phone_book) hm.put(a, 0);
        
        for(String number : hm.keySet()) {
        	
        	for (int i = 1; i < number.length(); i++) {
				
        		if(hm.containsKey(number.substring(0, i))) {
        			return false;
        		}
			}
        }
    	
        return true;
        
    }
}