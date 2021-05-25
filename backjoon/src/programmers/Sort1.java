package programmers;

import java.util.Arrays;

class Sort1 {
    public int[] solution(int[] array, int[][] commands) {
    	
        int[] tmpAnswer = {};
        
        int[] result = new int[commands.length];
        
        int from, to, idx, tmp;
        int answerIdx = 0;
        for (int i = 0; i < commands.length; i++) {
        	
			
        	from = commands[i][0];
        	to = commands[i][1];
        	idx = commands[i][2];
        	
        	tmpAnswer = new int[to - from + 1];
        	
        	tmp = 0;
        	for (int j = from - 1; j < to; j++) {
				tmpAnswer[tmp++] = array[j];
			}
        	
        	Arrays.sort(tmpAnswer);
        	
        	result[answerIdx++] = tmpAnswer[idx - 1];
        	
		}
        
        
        return result;
        
    }
}