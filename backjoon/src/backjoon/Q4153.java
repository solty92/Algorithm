package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] inpt = br.readLine().split(" ");
			int[] array = new int[3];
			array[0] = Integer.parseInt(inpt[0]);
			array[1] = Integer.parseInt(inpt[1]);
			array[2] = Integer.parseInt(inpt[2]);
			
			int tmp = 0;
			if(array[0] > array[1] && array[0] > array[2]) {
				tmp = array[0];
				array[0] = array[1];
				array[1] = array[2];
				array[2] = tmp;
				
			}else if(array[1] > array[0] && array[1] > array[2]) {
				tmp = array[1];
				array[1] = array[2];
				array[2] = tmp;
			}
			
			
			if(array[2] == 0) break;
			
			String result = array[0]*array[0] + array[1]*array[1] == array[2]*array[2] ? "right" : "wrong";
			bw.write(result + "\n");
		}
		
		bw.close();
		
	}
}