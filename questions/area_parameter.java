package questions;
/*

Area & Perimeter of Rectangle

Write a program for the following problem:

Let’s consider a rectangle of sides a = 11 and b = 13.

Find and output area of the rectangle having sides as 

Find and output perimeter of the rectangle having side as a & b.

For any rectangle, the formula for area is length * breadth.

The formula for perimeter is 2 * (length + breadth).

*/

public class area_parameter {

    public static void main(String args[]){
        System.out.println("Question-1: Find and output area of the rectangle having sides as a and b.");
        System.out.println("For any rectangle, the formula for area is length * breadth.");
        int a = 11;
        int b = 13;
        System.out.println("int a = 11;");
        System.out.println("int b = 13;");
        System.out.println("System.out.println(a*b)");
        System.out.println("The Output is= "+ a*b);
        System.out.println();
        System.out.println();
        System.out.println("Question-2: Find and output perimeter of the rectangle having side as a & b.");
        System.out.println("The formula for perimeter is 2 * (length + breadth)");
        System.out.println("System.out.println(2*(a+b)");
        System.out.println("The Output is = "+ 2*(a+b));
    }
}
