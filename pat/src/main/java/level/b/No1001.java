package level.b;

import java.util.Scanner;

/**
* @author xiey
* @version 2017年11月27日 下午3:43:24
* @describe No后面的数字对应牛客网的题目序号,A+B和C (15)
*/
public class No1001 {
	public static void main(String[] args) {
		int T = 0,i=1;
		long a,b,c;
		Scanner input= new Scanner(System.in);
		T=input.nextInt();
		
		while(i<=T) {
			a = input.nextLong();
			b = input.nextLong();
			c = input.nextLong();
			System.out.println("Case #"+i+": "+(a+b>c));
			i++;
		}
	}
}
