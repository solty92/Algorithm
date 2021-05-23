package programmers;

import java.util.Arrays;

class Hash1 {
	
    public String solution(String[] participant, String[] completion) {
    	
    	String answer = "";

    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	
    	boolean isFound = false;
    	for (int i = 0; i < completion.length; i++) {
			
    		if(!participant[i].equals(completion[i])) {
    			answer = participant[i];
    			isFound = true;
    			break;
    		}
		}
    	
    	if(!isFound) answer = participant[participant.length - 1];
    	
        return answer;
    }
}