package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SW1230 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		LinkedList<Integer> lList;
		StringTokenizer st, st1;
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			int codeLength = Integer.parseInt(br.readLine());
			
			lList = new LinkedList<Integer>();
			
			// 원본 암호문 넣기
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < codeLength; i++) {
				lList.add(Integer.parseInt(st.nextToken()));
			}
			
			// 명령문 배열에 저장 
			int orderCount = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "IDA", true);
			
			// 명령문 실행
			for (int i = 0; i < orderCount; i++) {
				
				String ID = st.nextToken();
				
				if(ID.equals("I")) {
					st1 = new StringTokenizer(st.nextToken());
					int idx = Integer.parseInt(st1.nextToken());
					int numCount = Integer.parseInt(st1.nextToken());
					
					for (int j = 0; j < numCount; j++) {
						lList.add(idx++, Integer.parseInt(st1.nextToken()));
					}
				}else if(ID.equals("D")){
					st1 = new StringTokenizer(st.nextToken());
					int idx = Integer.parseInt(st1.nextToken());
					int count = Integer.parseInt(st1.nextToken());
					
					while(count > 0) {
						lList.remove(idx);
						count--;
					}
				}else {
					st1 = new StringTokenizer(st.nextToken());
					
					int count = Integer.parseInt(st1.nextToken());
					
					while(count > 0) {
						lList.add(Integer.parseInt(st1.nextToken()));
						count--;
					}
				}
			}
			
			bw.write("#" + testCase);
			for (int i = 0; i < 10; i++) {
				bw.write(" " + lList.get(i));
			}
			bw.write("\n");
			
		}
		
		bw.close();
		
	}
}