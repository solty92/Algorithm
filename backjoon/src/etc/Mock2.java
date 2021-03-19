package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Mock2 {
	public static void main(String[] args) throws Exception {	// 사은품 교환하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N, M;
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Long.parseLong(st.nextToken());
			M = Long.parseLong(st.nextToken());
			
			long result = calculator(N, M);
			bw.write(result + "\n");
		}
	
		bw.close();
	}
	
	public static long calculator(long N, long M) {
		
		long maxCoupon = (N+M) / 12;
		long minCoupon = N / 5;
		
		long couponCount = (maxCoupon <= minCoupon)? maxCoupon : minCoupon;
		
		return couponCount;
	}
}