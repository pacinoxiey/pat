package level;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = in.nextInt();

		while (sum-- > 0) {
			String string = in.nextLine();
			cheak(string);
		}
	}

	static void cheak(String string) {
		int indexOfP, indexOfA, indexOfT;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'P') {
				indexOfP = i;
			} else if (string.charAt(i) == 'T') {
				indexOfA = i;
			} else if (string.charAt(i) == 'A') {

			} else {
				System.out.println("NO");
			}
		}

		indexOfP = string.indexOf("P");
		indexOfA = string.indexOf("A");
		indexOfT = string.indexOf("T");
		if (indexOfP == 0 || indexOfA == -1 || indexOfT == -1) {
			System.out.println("NO");
			return;
		}

		// b
		int bSum = indexOfT - indexOfP;

		if (bSum > 0) {

		}

		return;
	}
}
