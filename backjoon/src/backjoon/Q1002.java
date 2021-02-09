package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			String[] inpt = br.readLine().split(" ");
			double x1 = Double.parseDouble(inpt[0]);
			double y1 = Double.parseDouble(inpt[1]);
			double r1 = Double.parseDouble(inpt[2]);
			double x2 = Double.parseDouble(inpt[3]);
			double y2 = Double.parseDouble(inpt[4]);
			double r2 = Double.parseDouble(inpt[5]);
			
			double lengthBtwn = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			
			if(lengthBtwn == 0) {
				if(r1 == r2) bw.write("-1\n");
				
				else bw.write("0\n");
				
			}else {
				if(r1+r2 > lengthBtwn) {
					if(r2 > lengthBtwn + r1 || r1 > lengthBtwn + r2) bw.write("0\n");
					
					else if(r2 == lengthBtwn + r1 || r1 == lengthBtwn + r2) bw.write("1\n");
					
					else bw.write("2\n");
					
				}else if(r1+r2 == lengthBtwn) bw.write("1\n");
				
				else bw.write("0\n");
				
			}
		}
		
		
		bw.close();
		
	}
}