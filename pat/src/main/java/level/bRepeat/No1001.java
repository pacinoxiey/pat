package level.bRepeat;

import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月27日 下午6:24:30s
 * @describe 卡拉兹猜想
 */
public class No1001 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int step = 0;
		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = (3 * num + 1) / 2;
			}
			step++;
		}
		System.out.println(step);
	}
}
