package programmers;

import java.util.HashMap;

class Hash1_1 {
	
    public String solution(String[] participant, String[] completion) {
    	
    	String answer = "";

    	HashMap<String, Integer> hm = new HashMap<String, Integer>();
    	
    	for(String a : participant) {
    		hm.put(a, hm.getOrDefault(a, 0) + 1);
    	}
    	
    	for(String a : completion) {
    		hm.put(a, hm.get(a) - 1);
    	}
    	
    	for(String key : hm.keySet()) {
    		
    		if(hm.get(key) != 0) {
    			answer = key;
    			break;
    		}
    	}
    	
        return answer;
    }
}