package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] array = br.readLine().split(" ");
		
		int x = Integer.parseInt(array[0]);
		int y = Integer.parseInt(array[1]);
		int w = Integer.parseInt(array[2]);
		int h = Integer.parseInt(array[3]);
		
		int xLength = w-x > x ? x : w-x;
		int yLength = h-y > y ? y : h-y;
		int result = xLength > yLength ? yLength : xLength;
		
		bw.write("" + result);
		
		bw.close();
		
	}
}