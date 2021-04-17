package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SW1228 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		LinkedList<Integer> lList;
		StringTokenizer st;
		
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
			String[] order = new String[orderCount];
			String tmp = br.readLine().replaceFirst("I", "");
			order = tmp.split("I");
			
			// 명령문 실행
			for (int i = 0; i < orderCount; i++) {
				st = new StringTokenizer(order[i]);
				
				int idx = Integer.parseInt(st.nextToken());
				int numCount = Integer.parseInt(st.nextToken());
				
				while(st.hasMoreTokens()) {
					lList.add(idx++, Integer.parseInt(st.nextToken()));
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