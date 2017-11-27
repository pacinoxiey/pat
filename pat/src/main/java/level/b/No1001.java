package level.b;

import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月27日 下午6:24:30s
 * @describe 卡拉兹猜想
 */
public class No1001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, step = 0;
		num = input.nextInt();
		while (num != 1) {
			if (num % 2 != 0) {
				num = (3 * num + 1) / 2;
			} else {
				num = num / 2;
			}
			step += 1;
		}
		System.out.println(step);
	}
}
