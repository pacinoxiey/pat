package exams;

import java.util.Random;
import java.util.Scanner;

import com.google.gson.Gson;

/**
 * @author 10040 小赌怡情
 */
public class No1 {
	static Gson gson = new Gson();
	public static void main(String[] args) {
		// 系统赠送筹码,轮数,n1 基础整数,n2 后一个数字,本轮筹码,押胜负
		int T, K, n1, n2 = 0, t, b;
		// 控制台字符串
		String iString;
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		iString = in.nextLine();

		T = Integer.parseInt(iString.split(" ")[0]);
		K = Integer.parseInt(iString.split(" ")[1]);
		if (K > 100 || K <= 0) {
			System.err.println("err:k");
		}
		System.out.println("筹码:" + T + ",轮数:" + K);
		int i = 1;
		// n1 b t n2
		while (i <= K) {
			i++;
			// 给出100内的随机数
			n1 = random.nextInt(9) + 1;
			System.out.print(n1);
			iString = in.nextLine();// 大小, 筹码
//			System.out.println(gson.toJson(iString.split(" ")));
			do {
				n2 = random.nextInt(9) + 1;
			} while (n1 == n2);

			b = Integer.parseInt(iString.split(" ")[1]);
			t = Integer.parseInt(iString.split(" ")[2]);

			System.out.println(" " + n2);

			if (t > T) {
				System.out.println("Not enough tokens. Total = " + T + ".");
			} else {
				if (b == 0) {// 押小

					if (n2 > n1) {
						// fail
						T -= t;

						System.out.println("Lose " + t + ". Total = " + T + ".");
						if (T == 0) {
							System.out.println("Game Over.");
							i = K+1;
						}
					} else {
						// win
						T += t;
						System.out.println("Win " + t + "! Total =" + T + ".");
					}
				} else if (b == 1) {// 押大
					if (n2 > n1) {
						// win
						T += t;
						System.out.println("Win " + t + "! Total =" + T + ".");

					} else {
						// fail
						T -= t;

						System.out.println("Lose " + t + ". Total = " + T + ".");
						if (T == 0) {
							System.out.println("Game Over.");
						}
					}
				}
			}
		}
	}
}
