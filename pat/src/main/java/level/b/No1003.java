package level.b;

import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月28日 上午12:15:07
 * @describe
 */
public class No1003 {
	public static void main(String[] args) {
		int round = 0;
		Scanner in = new Scanner(System.in);
		round = in.nextInt();
		in.nextLine();
		for (int i = 0; i < round; i++) {

			check(in.nextLine());
		}
	}

	public static void check(String str) {
		int indexOfA, indexOfP, indexOfT, length, Acount = 0, Pcount = 0, Tcount = 0;
		// PT个数
		// 是否含有其它字符
		length = str.length();
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == 'P') {
				++Pcount;
			} else if (str.charAt(i) == 'A') {
				++Acount;
			} else if (str.charAt(i) == 'T') {
				++Tcount;
			} else {
				System.out.println("NO");
				return;
			}
		}
		if (!(Pcount == 1 && Tcount == 1 && Acount > 0)) {
			System.out.println("NO");
			return;
		}
		// aPbATca bA=c
		indexOfA = str.indexOf("A");
		indexOfP = str.indexOf("P");
		indexOfT = str.indexOf("T");
		if (indexOfP > indexOfT) {
			System.out.println("NO");
			return;
		}
		int a = 0, b, c;
		// 拿到a的A个数
		if (indexOfP > 0 && indexOfA < indexOfP) {
			a = indexOfP;
		}
		// 拿到b的A个数pat
		if (indexOfT - indexOfP <= 1) {
			System.out.println("NO");
			return;
		}
		b = indexOfT - indexOfP - 1;
		c = str.length() - indexOfT - 1;
		/**
		 * 注意b = 1
		 */
		if (a*b+a == a+c) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		return;
	}
}