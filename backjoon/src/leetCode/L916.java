package leetCode;

import java.util.ArrayList;
import java.util.List;

class L916 {
    public List<String> wordSubsets(String[] words1, String[] words2) {
     
    	List<String> list = new ArrayList<String>();
    	
    	// words2를 모두 int 배열로 저장해놓기  
    	int[][] bArr = new int[words2.length][26];
    	String tmp;
    	for (int i = 0; i < words2.length; i++) {
    		tmp = words2[i];
    		
    		for (int j = 0; j < tmp.length(); j++) {
				bArr[i][tmp.charAt(j) - 97]++;
			}
		}
    	
    	// bArr의 각 자리 최대값으로 이루어진 mergedB 배열에 통합
    	int[] mergedB = new int[26];
    	int biggest;
    	for (int i = 0; i < mergedB.length; i++) {
			biggest = 0;
			
    		for(int[] b : bArr) {
    			if(b[i] > biggest) biggest = b[i];
    		}
    		
    		mergedB[i] = biggest;
    		
		}
    	
    	// words1에서 한단어씩 꺼내고 mergedB와 같이 aArr만들고 0이 아닌 각 자리 비교해본다 
    	int[] aArr;
    	boolean isUniversal;
    	for(String a : words1) {
    		aArr = new int[26];
    		
    		for (int i = 0; i < a.length(); i++) {
				aArr[a.charAt(i) - 97]++;
			}

    		
    		isUniversal = true;
    		int ttmp;
    		// mergedB과 aArr 비교
    		for (int i = 0; i < mergedB.length; i++) {
				
    			ttmp = mergedB[i];
    			
    			if(ttmp != 0) {
    				
    				if(aArr[i] < ttmp) {
    					isUniversal = false;
    					break;
    				}
    				
    			}
    			
			}
    		
    		if(isUniversal) list.add(a);
    		
    	}
    	
    	return list;
    }
    
    public static void main(String[] args) {
    	
    	L916 sol = new L916();
    	
    	String[] aaa = {"amazon","apple","facebook","google","leetcode"};
    	String[] bbb = {"e","o"};
    	sol.wordSubsets(aaa, bbb);
	}
}