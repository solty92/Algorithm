package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2875 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int possibleN = N / 2;
		int possibleM = M;
		
		int maxTeamCount = possibleN < possibleM ? possibleN : possibleM;
		
		int residual = (N - 2 * (maxTeamCount)) + (M - maxTeamCount);
		
		K -= residual;
		
		while(K > 0) {
			
			K -= 3;
			
			maxTeamCount--;
			
		}
		
		bw.write(maxTeamCount + "");
		
		bw.close();
	}
}