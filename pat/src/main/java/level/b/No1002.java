package level.b;

import java.util.Scanner;

/**
* @author xiey
* @version 2017年11月27日 下午6:46:09
* @describe 写出这个数
*/
public class No1002 {
	
	public static void main(String[] args) {
		String[] pinyin = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
		Scanner in = new Scanner(System.in);
		int sum=0;
		String[] line;
		line = in.nextLine().split("");
		for (int i = 0; i < line.length; i++) {
			sum+=Integer.valueOf(line[i]);
		}
		//这里会被空格干扰导致无法通过官网测试
		String[] py = String.valueOf(sum).split("");
		
		for (int i = 0; i < py.length; i++) {
			System.out.print(pinyin[Integer.valueOf(py[i])]);
			if (i<py.length-1) {
				System.out.print(" ");
			}
		}
	}
	/**
	 * 解法二
	 */
	void method(){
		Scanner in = new Scanner(System.in);
		String[] pinyin = { "ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi" };
		char[] chars = in.next().toCharArray();
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			sum += chars[i] - '0';
		}
		String s = String.valueOf(sum);
		System.out.print(pinyin[s.charAt(0) - '0']);
		for (int i = 1; i < s.length(); i++) {
			System.out.print(" " + pinyin[s.charAt(i) - '0']);
		}	
	}
}
