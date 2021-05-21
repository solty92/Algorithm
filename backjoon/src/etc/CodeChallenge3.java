package etc;

public class CodeChallenge3 {
	
	public static long solution(int[] a, int[][] edges) {
		boolean isAllZero = true;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != 0) isAllZero = false;
		}
		if(isAllZero) return 0;
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		if(sum != 0) return -1;
		
        long answer = -2;
        return answer;
        
        
        
    }
	
	public static void main(String[] args) {
		int[] a = {-5,0,2,1,2};
		int[][] edges = {{0,1},{3,4},{2,3},{0,3}};
		
		System.out.println(solution(a, edges));
	}
}