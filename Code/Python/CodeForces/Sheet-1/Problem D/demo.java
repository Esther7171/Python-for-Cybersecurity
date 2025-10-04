import java.util.*;
public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);
        Long a = test.nextLong();
        Long b = test.nextLong();
        Long c = test.nextLong();
        Long d = test.nextLong();
        Long x = ((a * b) - (c * d));
        System.out.println("Difference = "+ x);
    }
}