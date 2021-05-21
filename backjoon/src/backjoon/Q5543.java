package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q5543 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] burger = new int[3];
		
		for (int i = 0; i < 3; i++) {
			burger[i] = Integer.parseInt(br.readLine());
		}
		
		int coke = Integer.parseInt(br.readLine());
		int sprite = Integer.parseInt(br.readLine());
		
		Arrays.sort(burger);
		int cheapBurger = burger[0];
		
		int cheapDrink = coke < sprite ? coke : sprite;
		
		int setPrice = cheapBurger + cheapDrink - 50;
		
		bw.write(setPrice + "");
		
		bw.close();
	}
}