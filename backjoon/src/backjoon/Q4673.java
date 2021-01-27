package backjoon;

public class Q4673 {
	public static void main(String[] args) {

		boolean[] check = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) {
				check[n] = true;
			}
		}

		for (int i = 1; i < check.length; i++) {
			if (check[i] == false) {
				System.out.println(i);
			}
		}

	}

	public static int d(int number) {
		int tmp = number;
		while (number > 0) {
			tmp += number % 10;
			number /= 10;
		}

		return tmp;
	}
}