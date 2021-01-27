package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		
		String secondLine = br.readLine();
		String[] list = secondLine.split(" ");
		
		int tmp = Integer.parseInt(list[0]);
		
		//min
		for (int i = 1; i < length; i++) {
			if(Integer.parseInt(list[i]) < tmp) {
				tmp = Integer.parseInt(list[i]);
			}
		}
		bw.write(tmp+" ");
		
		
		tmp = Integer.parseInt(list[0]);
		//max
		for (int i = 1; i < length; i++) {
			if(Integer.parseInt(list[i]) > tmp) {
				tmp = Integer.parseInt(list[i]);
			}
		}
		bw.write(""+tmp);
		
		bw.flush();
		bw.close();
	}
}