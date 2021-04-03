package etc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class kakao2 {
   
   public static int solution(int[][] needs, int r) {
      
      int[][] countNeeds = new int[needs[0].length][2];
      
      for (int i = 0; i < countNeeds.length; i++) {
         countNeeds[i][0] = i;
      }
      
      for (int i = 0; i < needs.length; i++) {
         for (int j = 0; j < countNeeds.length; j++) {
            if(needs[i][j] == 1) countNeeds[j][1]++;
         }
      }
      
      Arrays.sort(countNeeds, new Comparator<int[]>() {
         @Override
         public int compare(int[] t1, int[] t2) {
            return t2[1] - t1[1];
         }
      });
      
      ArrayList<Integer> machine = new ArrayList<Integer>();
      
      for (int i = 0; i < r; i++) {
         machine.add(countNeeds[i][0]);
      }

      for(int a : machine) {
         System.out.println(a);
      }
      
      int countPossibleProduct = needs.length;
      for (int i = 0; i < needs.length; i++) {
         boolean isPossible = true;
         
         for (int j = 0; j < needs[0].length; j++) {
            
            if(needs[i][j] == 1 && !machine.contains(j)) {
               isPossible = false;
               break;
            }
         }
         
         if(!isPossible) countPossibleProduct--;
      }
      

        return countPossibleProduct;
    }
   
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int[][] sampleArr = { { 1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1} };
//      int[][] sampleArr = { { 0, 0, 1 }, {0, 1, 1}, {0, 1, 1}, {1, 0, 1}, {0, 1, 0}, {0, 1, 1} };
      int sampleR = 2;
      
      int result = solution(sampleArr, sampleR);
      
      bw.write("result : " + result + "");

      bw.close();
   }
}