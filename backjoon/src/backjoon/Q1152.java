package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String stripped = br.readLine().strip();
		
		String[] array = stripped.split(" ");
		
		if (array[0] == "") {
			bw.write("0");
		}else {
			bw.write(array.length + "");
		}
		
		bw.flush();
		bw.close();
		
	}
}