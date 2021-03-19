package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Mock1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double N = Double.parseDouble(st.nextToken());
		double K = Double.parseDouble(st.nextToken());
		
		String inpt = br.readLine();
		
		int result = (int) Math.ceil((N-1) / (K-1));
		
		System.out.println(result);
	}
}