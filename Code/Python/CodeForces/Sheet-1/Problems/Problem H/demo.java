import java.util.*;
public class demo{
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double result = (double) A / B;

        int floor = (int) Math.floor(result);
        int ceil = (int) Math.ceil(result);
        int round = (int) Math.round(result);

        System.out.println("floor " + A + " / " + B + " = " + floor);
        System.out.println("ceil " + A + " / " + B + " = " + ceil);
        System.out.println("round " + A + " / " + B + " = " + round);
    }
}