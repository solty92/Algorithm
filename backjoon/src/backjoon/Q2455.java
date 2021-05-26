package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2455 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Train train = new Train();
		
		StringTokenizer st;
		int plus, minus;
		int max = 0;
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			
			minus = Integer.parseInt(st.nextToken());
			plus = Integer.parseInt(st.nextToken());
			
			train.getOff(minus);
			train.getOn(plus);
			
			max = max < train.passengers ? train.passengers : max;
		}
		
		bw.write(max + "");
		
		bw.close();
	}

}

class Train {
	
	int passengers = 0;
	
	public void getOff(int n) {
		this.passengers -= n;
	}
	
	public void getOn(int n) {
		this.passengers += n;
	}
	
	
}