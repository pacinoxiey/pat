package level.bRepeat;

import java.util.Scanner;

/**
 * @author xiey
 * @version 2018年2月6日 下午2:23:50
 * @describe
 */
public class No1002 {
	public static void main(String[] args) {
		String[] pinyin = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi" };
		Scanner in = new Scanner(System.in);
		char[] charArr = in.next().toCharArray();
		int sum = 0;
		for (char string : charArr) {
			sum += Integer.valueOf(string - '0');
		}

		charArr = String.valueOf(sum).toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			System.out.print(pinyin[charArr[i] - '0']);
			if (i < charArr.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
