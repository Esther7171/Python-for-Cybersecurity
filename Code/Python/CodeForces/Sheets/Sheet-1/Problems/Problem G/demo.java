import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);

        // Sum = N * (N + 1) / 2
        long a = test.nextLong();
        long sum = a * (a + 1)/2;
        System.out.println(sum);

    }
}