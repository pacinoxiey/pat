package level.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月28日 下午11:59:29
 * @describe 继续卡拉子猜想 1.依次卡兹拉运算, 只要样例里包含运算过程中的数字就删除(注意:list.remove int值时候, 需要讲值封装成Integer)
 */
public class No1005 {
	public static void main(String[] a) {
		Scanner inScanner = new Scanner(System.in);
		int round = inScanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> clone = new ArrayList<Integer>();
		while (round-->0) {
			list.add(inScanner.nextInt());
		}
		clone.addAll(list);
		for (int i = 0; i < clone.size(); i++) {
			int num = clone.get(i);
			while (num != 1) {
				if (num % 2 != 0) {
					num = (3 * num + 1) / 2;
				} else {
					num = num / 2;
				}
				
				if (list.contains(num)) {
					list.remove((Integer)num);
				}
			}
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for (int i = 0; i < list.size()-1; i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println(list.get(list.size()-1));
	}
}
