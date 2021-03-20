package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Scofe1 {
	public static void main(String[] args) throws Exception {	// 대여 시간을 추천해드립니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] timeArr = new String[N][2];
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine().replaceAll(" ", "");
			tmp = tmp.replaceAll(":", "");
			timeArr[i] = tmp.split("~");
		}
		
		int[] fromArr = new int[N];
		for (int i = 0; i < N; i++) {
			fromArr[i] = Integer.parseInt(timeArr[i][0]);
		}
		
		
		int[] toArr = new int[N];
		for (int i = 0; i < N; i++) {
			toArr[i] = Integer.parseInt(timeArr[i][1]);
		}

		
		Arrays.sort(fromArr);
		String fromResult;
		String value = Integer.toString(fromArr[fromArr.length-1]);
		if(fromArr[fromArr.length-1] < 10) {
			fromResult = "000" + value;
		}else if(fromArr[fromArr.length-1] < 100){
			fromResult = "00" + value;
		}else if(fromArr[fromArr.length-1] < 1000) {
			fromResult = "0" + value;
		}else {
			fromResult = value;
		}
		
		Arrays.sort(toArr);
		String toResult;
		value = Integer.toString(toArr[0]);
		if(toArr[0] < 10) {
			toResult = "000" + value;
		}else if(toArr[0] < 100){
			toResult = "00" + value;
		}else if(toArr[0] < 1000) {
			toResult = "0" + value;
		}else {
			toResult = value;
		}
		
		
		
		
		if(fromArr[fromArr.length-1] > toArr[0]) bw.write("-1");
		else {
			String hFrom = fromResult.substring(0, 2);
			String mFrom = fromResult.substring(2, 4);

			String hTo = toResult.substring(0, 2);
			String mTo = toResult.substring(2, 4);
			bw.write(hFrom + ":" + mFrom + " ~ " + hTo + ":" + mTo);
		}
	
		bw.close();
	}
	
}