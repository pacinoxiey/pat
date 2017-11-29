package level.b;

import java.util.Scanner;

/**
* @author xiey
* @version 2017年11月29日 下午8:13:46
* @describe
*/
public class No1006 {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int b, s, g;
		b = num / 100;
		s = num % 100 / 10;
		g = num % 100 % 10;
		int[] arr = {b,s,g};
		
		for (int i = 0; i < b; i++) {
			System.out.print("B");
		}
		for (int i = 0; i < s; i++) {
			System.out.print("S");
		}
		for (int i = 0; i < g; i++) {
			System.out.print(i+1);
		}
	}
}
