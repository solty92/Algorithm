package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class L1859 {
    public String sortSentence(String s) {
        
    	StringTokenizer st = new StringTokenizer(s);
    	
    	List<String> list = new ArrayList<String>();
    	
    	while(st.hasMoreTokens()) {
    		list.add(st.nextToken());
    	}
    	
    	String[] order = new String[list.size()];
    	for(String a : list) {
    		
    		order[a.charAt(a.length()-1)-49] = a.substring(0, a.length()-1);
    		
    	}
    	
    	String ans = "";
    	for(String a : order) {
    		ans += a + " ";
    	}
    	
    	ans = ans.trim();
    	
    	return ans;
    }
}