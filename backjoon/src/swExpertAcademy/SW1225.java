package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW1225 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		Queue<Integer> q;
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			br.readLine();
			
			st = new StringTokenizer(br.readLine());
			
			q = new LinkedList<Integer>();
			
			while(st.hasMoreTokens()) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			
			Queue<Integer> resultQ = encoding(q);
			
			bw.write("#" + testCase);
			for(int a : resultQ) {
				bw.write(" " + a);
			}
			bw.write("\n");
		}
		
		bw.close();
	}
	
	private static Queue<Integer> encoding(Queue<Integer> q) {
		int minus = 1;
		
		while(true) {
			int tmp = q.poll() - minus++;
			
			if(tmp > 0) {
				q.add(tmp);
			}else {
				tmp = 0;
				q.add(tmp);
				break;
			}
			
			if(minus == 6) minus = 1;
		}
		
		return q;
		
	}
}