package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inpt = br.readLine().split(" ");
		BigInteger a = new BigInteger(inpt[0]);
		BigInteger b = new BigInteger(inpt[1]);
		
		BigInteger result = a.add(b);
		
		bw.write(result + "");
		
		bw.close();
		
	}
	
}