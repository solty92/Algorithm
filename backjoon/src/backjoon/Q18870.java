package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q18870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 중복제거 
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int a : arr) {
			hs.add(a);
		}
		
		// 정렬한 배열
		ArrayList<Integer> orderArr = new ArrayList<Integer>();
		for(int a : hs) {
			orderArr.add(a);
		}
		
		orderArr.sort(null);
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		// 맵에 각 숫자의 순서를 저장 
		int tmp = 0;
		for(int a : orderArr) {
			hm.put(a, tmp++);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = hm.get(arr[i]);
		}
		
		for(int a : arr) {
			bw.write(a + " ");
		}
		
		bw.close();
	}
}