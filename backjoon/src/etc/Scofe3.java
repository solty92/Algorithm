package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Scofe3 {
    static int[][] area;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        area = new int[N][N];
        int total_count=0;

        for(int i=0;i<N;i++){
            String[] area_str = br.readLine().split("");
            int len_sum = 0;
            for(int j=N-1;j>=0;j--){
                int len = Integer.parseInt(area_str[j]);
                len_sum = (len==0)?0:len_sum+len;
                area[i][j] = len_sum;
            }
        }

        for(int size=1;size<=N;size++){
            int count_per_size = 0;
            for(int cordX=0;cordX<=N-size;cordX++){
                for(int cordY=0;cordY<=N-size;cordY++){
                    count_per_size += isPossible(cordX,cordY,size);
                }
            }

            if(count_per_size==0) break;

            total_count += count_per_size;
            bw.write("\nsize["+size+"]: "+count_per_size);
        }

        System.out.print("total: " + total_count);
        bw.flush();
        bw.close();
    }

    public static int isPossible(int cordX, int cordY, int size){
        // result [0]: impossible, [1]: [possible]
        int result = 1;

        for(int i=cordX;i<cordX+size;i++){
            if(area[i][cordY]<size){
                result = 0;
                break;
            }
        }
        return result;
    }
}