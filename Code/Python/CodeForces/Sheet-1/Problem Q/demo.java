import java.util.*;
public class demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Double x_axis = sc.nextDouble();
        Double y_axis = sc.nextDouble();

        if(x_axis ==0 && y_axis == 0){
            System.out.println("Origem");
        }
        else if(x_axis == 0 && y_axis < 0 && y_axis > 0 ){
            System.out.println("Eixo X");
        }
        else if(y_axis == 0 && x_axis < 0 && x_axis > 0){
            System.out.println("Eixo Y");
        }
        else if(x_axis >= 0 && y_axis >= 0){
            System.out.println("Q1");
        }
        else if(x_axis <= 0 && y_axis >=0 ){
            System.out.println("Q2");
        }
        else if( x_axis <= 0 && y_axis <= 0){
            System.out.println("Q3");
        }
        else if(x_axis >= 0 && y_axis <= 0){
            System.out.println("Q4");
        }
    }
}