package level.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月27日 下午11:25:02
 * @describe test
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");

        List<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i])%5;

            if (num==0) {

            }

            if (num % 5 == 0 && num % 2 == 0) {
                //A1
                a1.add(num);
            }
        }


    }
}
