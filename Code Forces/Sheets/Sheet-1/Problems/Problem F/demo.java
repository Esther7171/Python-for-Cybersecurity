import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner test = new Scanner(System.in);

        // taking 1st int and storing reminder in another vairiable
        Long a = test.nextLong();
        Long last_digit_of_first_number = a % 10;

        Long b = test.nextLong();
        Long last_digit_of_second_number = b % 10;

        // Sum
        Long sum = last_digit_of_first_number + last_digit_of_second_number;
        System.out.println(sum);
    }
}