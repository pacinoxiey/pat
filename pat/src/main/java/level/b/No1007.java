package level.b;

import java.util.Scanner;

/**
* @author xiey
* @version 2017年11月30日 上午12:00:34
* @describe 素数 只有1和本身能够整除的数
*/
public class No1007 {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int tag = -1;
		int count = 0;
		for (int i = 2; i <= num; i++) {
			boolean flag = isPrime(i);
			if (flag == true) {
				if (i - tag == 2) {
					count++;
					tag = i;
				}
				tag = i;
			}
		}

		System.out.println(count);
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
