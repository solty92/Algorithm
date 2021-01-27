package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char chr = (char)br.read();
		
		int result = ascii(chr);
	
		bw.write(result+"");
	
		bw.flush();
		bw.close();
	}
	public static int ascii(char c) {
		int code = (int)c;
		return code;
	}
}