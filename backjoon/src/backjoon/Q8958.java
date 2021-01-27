package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int subject = Integer.parseInt(br.readLine());
		int countO = 0;
		int value = 0;
		
		for (int i = 0; i < subject; i++) {
			String ipt = br.readLine();
			
			for (int j = 0; j < ipt.length(); j++) {
				if(ipt.substring(j,j+1).equals("O")) {
					countO++;
					value += countO;
				}else {
					countO = 0;
				}
			}
			
			bw.write(value+"\n");
			countO=0;
			value=0;
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}