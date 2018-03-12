package level.b;

import java.util.Scanner;

/**
 * 说反话
 *
 * @author 10040 xiey
 * @create 2018/3/12 16:39
 */

public class No1009 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] arr = line.split(" ");

        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[0]);
    }

}
