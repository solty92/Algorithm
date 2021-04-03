package etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class kakao3 {
    public int[] solution(int n, int[] passenger, int[][] train) {
        
        ArrayList[] arrList = new ArrayList[n+1];
        boolean[] visited = new boolean[n+1];
        int[] totalPassenget = new int[n+1];
        
        Queue<Integer> q = new <Integer> LinkedList();

        for(int i=1;i<=n;i++) arrList[i] = new ArrayList();
        for(int i=0;i<train.length;i++) {
        	arrList[train[i][0]].add(train[i][1]);
        	arrList[train[i][1]].add(train[i][0]);
        }
        
       
        int[] answer = {1, passenger[0]}; 
        visited[1] = true;
        q.add(1);
        totalPassenget[1] = passenger[0];
        
        int current, next;
        while(!q.isEmpty()) {
        	current = q.poll();
        	ArrayList nextList = arrList[current];
        	for(int i=0;i<nextList.size();i++) {
        		next = (int)nextList.get(i);
        		if(!visited[next]) {
        			visited[next] = true;
        			totalPassenget[next] = totalPassenget[current] + passenger[next-1];
        			q.add(next);
        		}
        	}
        }
        
        
        for(int i=1;i<=n;i++) {
        	if(answer[1]<=totalPassenget[i]) {
        		answer[0] = i;
        		answer[1] = totalPassenget[i];
        	}
        }
        
        
        
        return answer;
    }
}