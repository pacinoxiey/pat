package level.b;

import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月27日 下午11:25:02
 * @describe
 */
public class Test {
	public static void main(String[] args) {
		String string;
		Scanner in = new Scanner(System.in);
		string = in.nextLine();
		if (string == "") {
			System.out.println(1);
		} else if (string == null) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
	}
}
