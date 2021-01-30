package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inpt = br.readLine();
		
		String[] array = inpt.split(" ");
		
		long A = Long.parseLong(array[0]);
		long B = Long.parseLong(array[1]);
		long C = Long.parseLong(array[2]);
		
		long netProfit = C-B;
		int count = 0;
		
		if(netProfit<=0) {
			bw.write("-1");
		}else {
			count = (int) (A/netProfit) +1;
			bw.write("" + count);
		}
		
		bw.flush();
		bw.close();
		
	}
	
}