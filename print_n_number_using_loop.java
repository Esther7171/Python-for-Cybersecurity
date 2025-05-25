import java.util.Scanner;

public class print_n_number_using_loop {
    public static void main(String args[]){
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n;i++){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
