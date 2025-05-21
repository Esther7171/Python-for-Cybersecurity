import java.util.*;

public class demo {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char meow = sc.next().charAt(0);

        // conditon 

        if ( meow >= 'a' && meow <= 'z'){
            meow = (char) (meow -32 ); // convert to uppercase
        }
        else if ( meow >= 'A' && meow <= 'Z'){
            meow = (char) (meow + 32); //convert to lowercase
        }
        System.out.println(meow);
    }
}