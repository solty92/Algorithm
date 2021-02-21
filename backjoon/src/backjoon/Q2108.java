package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		int[] countArray = new int[8001];
		
		for (int i = 0; i < N; i++) {
			int inpt = Integer.parseInt(br.readLine()) + 4000;
			array[i] = inpt;
			countArray[inpt]++;
		}
		
		Arrays.sort(array);
		
		bw.write(avg(array) + "\n");
		bw.write(mid(array) + "\n");
		bw.write(appearance(countArray) + "\n");
		bw.write(difference(array) + "");
		
		
		bw.close();
	}
	
	
	
	
	public static int avg(int[] array) {
		double total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		
		return (int)Math.round(total / array.length) - 4000;
	}
	
	
	
	
	public static int mid(int[] array) {
		
		return array[array.length / 2] - 4000;
	}
	


	
	public static int appearance(int[] countArray) {
		ArrayList<Integer> tmpArray = new ArrayList<Integer>();
		int maxCount = 0;
		
		for (int i = 0; i < countArray.length; i++) {
			if(countArray[i] > maxCount) {
				maxCount = countArray[i];
			}
		}
		
		for (int i = 0; i < countArray.length; i++) {
			if(countArray[i] == maxCount) {
				tmpArray.add(i-4000);
			}
		}
		
		Collections.sort(tmpArray);
		int result = tmpArray.size() == 1 ? tmpArray.get(0) : tmpArray.get(1);
		
		return result;
	}
	
	
	
	
	public static int difference(int[] array) {
		int differ = array[array.length -1] - array[0];
		
		return differ;
	}
	
	
}