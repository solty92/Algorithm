package swExpertAcademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SW1259 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCaseCount = Integer.parseInt(br.readLine());

		StringTokenizer st;
		for (int testCase = 1; testCase <= testCaseCount; testCase++) {
			int stickCount = Integer.parseInt(br.readLine());

			ArrayList<int[]> stickArr = new ArrayList<int[]>();

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < stickCount; i++) {
				stickArr.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
			}

			ArrayList<int[]> resultArr = new ArrayList<int[]>();

			// 막대기 하나를 배열에 넣고 앞에 갈 수 있는 막대기들을 찾는다.
			resultArr.add(stickArr.get(0));
			stickArr.remove(0);
			boolean isExist = true;
			boolean isFind;
			while (isExist) {

				int[] tmpResult = resultArr.get(0);
				isFind = false;
				for (int i = 0; i < stickArr.size(); i++) {

					int[] tmp = stickArr.get(i);

					if (tmp[1] == tmpResult[0]) {
						resultArr.add(0, tmp);
						stickArr.remove(i);
						isFind = true;
						break;
					}
				}
				if (!isFind) isExist = isFind;

			}

			// 이제 뒤에 붙일 막대기들 찾아 붙임
			isExist = true;

			while (isExist) {

				int[] tmpResult = resultArr.get(resultArr.size() - 1);
				isFind = false;
				for (int i = 0; i < stickArr.size(); i++) {

					int[] tmp = stickArr.get(i);

					if (tmp[0] == tmpResult[1]) {
						resultArr.add(tmp);
						stickArr.remove(i);
						isFind = true;
						break;
					}
				}
				if (!isFind) isExist = isFind;
			}

			bw.write("#" + testCase);
			for(int[] a : resultArr) {
				
				bw.write(" " + a[0] + " " + a[1]);
			}
			bw.write("\n");
		}

		bw.close();
	}
}