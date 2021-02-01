package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			String inpt = br.readLine();
			String[] array = inpt.split(" ");

			int y = Integer.parseInt(array[0]);
			int x = Integer.parseInt(array[1]);
			int guest = Integer.parseInt(array[2]);
			
			int floor = guest % y;
			int room = guest / y + 1;
			
			if(floor == 0) {
				floor = y;
				room--;
			}
			
			if(room < 10) {
				floor *= 10;
			}
			
			bw.write(""+ floor + room +"\n");
		}
		
		
		bw.flush();
		bw.close();
		
	}
	
}