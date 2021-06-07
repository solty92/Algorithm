package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2480 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];

		int biggest = 0;
		for (int i = 0; i < 3; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = tmp;
			biggest = tmp > biggest ? tmp : biggest;
		}
		
		int[] countArr = new int[7];
		int count;
		for (int i = 1; i <= 6; i++) {
			count = 0;
			for (int j = 0; j < 3; j++) {
				
				if(arr[j] == i) {
					count++;
				}
			}
			
			countArr[i] = count;
		}

		int repetition = 0, number = 0;
		for (int i = 1; i < countArr.length; i++) {
			
			if(countArr[i] > repetition) {
				repetition = countArr[i];
				number = i;
			}
		}
		
		if(repetition == 1) {
			number = biggest;
		}
		
		int result = prize(number, repetition);
		
		bw.write(result + "");
		
		bw.close();
	}

	private static int prize(int number, int repetition) {
		int prize = 0;
		
		if(repetition == 3) {
			prize = 10000 + number * 1000;
		}else if(repetition == 2) {
			prize = 1000 + number * 100;
		}else {
			prize = number * 100;
		}
		
		return prize;
	}
}