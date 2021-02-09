package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] coordArray = new int[6];
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			String[] array = br.readLine().split(" ");
			coordArray[count++] = Integer.parseInt(array[0]);
			coordArray[count++] = Integer.parseInt(array[1]);
		}
		
		int x = coordArray[0] == coordArray[2] ? coordArray[4] : coordArray[4] == coordArray[0] ? coordArray[2] : coordArray[0];
		int y = coordArray[1] == coordArray[3] ? coordArray[5] : coordArray[5] == coordArray[1] ? coordArray[3] : coordArray[1];
		
		bw.write(x + " " + y);
		bw.close();
		
	}
}