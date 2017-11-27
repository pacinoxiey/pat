package pat;

import java.util.Scanner;

/**
 * @author xiey
 * @version 2017年11月27日 下午2:01:28
 * @describe
 */
public class Test {
	public static boolean compare(long a,long b,long c){
        
        return a+b>c?true:false;
    }
     public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int count=sc.nextInt();
            for(int i=0;i<count;i++){
                System.out.println("Case #"+(i+1)+": "+compare(sc.nextLong(),sc.nextLong(),sc.nextLong()));
            }
        }
}
