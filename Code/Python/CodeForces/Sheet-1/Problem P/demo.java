import java.util.*;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextLine().charAt(0);
        if(a % 2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}