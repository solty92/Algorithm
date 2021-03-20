package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Scofe2{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] visitPossible = new boolean[N];
        long[] pathCount = new long[N];
        String[] area_str = br.readLine().split("");
        for(int i=0;i<N;i++) {
            visitPossible[i] = area_str[i].equals("1");
        }
        pathCount[0] = (visitPossible[0])?1L:0L;
        pathCount[1] = (visitPossible[1])?1L:0L;
        for(int i=2;i<N;i++){
            if(visitPossible[i]){
                pathCount[i] += (visitPossible[i-1])?pathCount[i-1]:0L;
                pathCount[i] += (visitPossible[i-2])?pathCount[i-2]:0L;
            }else{
                pathCount[i]=0L;
            }
        }
        System.out.print(pathCount[N-1]);
    }
}