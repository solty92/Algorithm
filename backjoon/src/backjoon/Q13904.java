package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q13904 {
	
	static int sum;
	static LinkedList<int[]> inptList;
	static LinkedList<Integer> selectList;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		inptList = new LinkedList<int[]>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			inptList.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}
		
		inptList.sort((o1, o2) -> {
			return o1[0] - o2[0];
		});
		
		
		selectList = new LinkedList<Integer>();
		
		int lastDay = 1000;
		for (int day = lastDay; day > 0; day--) {
			addAssignment(day);
			
			// 할 수 있는 과제 리스트 점수 오름차순으로 정렬 
			selectList.sort(null);
			
			doAssignment();
		}
		
		bw.write(sum + "");
		
		bw.close();
	}

	private static void addAssignment(int day) {
		
		while(true) {
			if(inptList.isEmpty()) return;
			
			int[] arr = inptList.peekLast();
			
			if(arr[0] == day) {
				selectList.add(inptList.pollLast()[1]);
				
			}else break;
		}
		
		
		
	}
	
	private static void doAssignment() {
		
		if(selectList.isEmpty()) return;
		
		sum += selectList.pollLast();
	}
}