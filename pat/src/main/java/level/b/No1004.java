package level.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import level.GsonUtil;

/**
 * @author xiey
 * @version 2017年11月28日 下午7:45:35
 * @describe 成绩排名 1.实现Comparable<T>接口, 重写compareTo方法
 */
public class No1004 implements Comparable<No1004> {

	String name;

	String no;

	int score;

	public No1004(String name, String no, int score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}

	public static void main(String[] args) {
		int round;
		String str;
		Scanner in = new Scanner(System.in);
		round = in.nextInt();
		ArrayList<No1004> list = new ArrayList<>();
		while (round-- > 0) {
			No1004 people = new No1004(in.next(), in.next(), in.nextInt());
			list.add(people);
		}

		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(GsonUtil.getInstance().toJson(list.get(i)));
		}
//		System.out.println(list.get(0).name + " " + list.get(0).score);
//		System.out.println(list.get(list.size() - 1).name + " " + list.get(list.size() - 1).score);
	}

	@Override
	public int compareTo(No1004 o) {
		// TODO Auto-generated method stub
		return o.score - this.score; // 从高到低排序
	}
}
