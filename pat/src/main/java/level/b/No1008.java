package level.b;

import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月30日 上午12:40:57
 * @describe 数组位移
 */
public class No1008 {
    public static void main(String[] args) {
        int num, index, flag;
        Scanner in = new Scanner(System.in);
        num = flag = in.nextInt();
        index = in.nextInt();
        int[] arr = new int[num];
        while (flag-- > 0) {
            if (index < num) {
                arr[index] = in.nextInt();
            } else {
                arr[index % num] = in.nextInt();
            }
            index++;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
