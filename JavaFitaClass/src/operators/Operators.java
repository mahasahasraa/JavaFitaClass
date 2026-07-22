package operators;

import java.util.Scanner;


public class Operators {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // --------------------------------------------------
        // Ternary Operator
        // --------------------------------------------------

        System.out.print("Enter your marks : ");
        double marks = input.nextDouble();

        String result = (marks > 40) ? "Pass" : "Fail";

        System.out.println("Result : " + result);

        // --------------------------------------------------
        // Increment & Decrement Operators
        // --------------------------------------------------

        int x = 1;

        System.out.println("\nIncrement & Decrement Operators");

        System.out.println("x = " + x);

        System.out.println("Post Increment : " + (x++));
        System.out.println("x = " + x);

        System.out.println("Pre Increment  : " + (++x));
        System.out.println("x = " + x);

        System.out.println("Post Decrement : " + (x--));
        System.out.println("x = " + x);

        System.out.println("Pre Decrement  : " + (--x));
        System.out.println("x = " + x);

        // --------------------------------------------------
        // Unary Operator
        // --------------------------------------------------

        int a = 10;
        int b = -10;

        System.out.println("\nUnary Operator");

        System.out.println("~10  = " + (~a));
        System.out.println("~-10 = " + (~b));

        boolean c = true;
        boolean d = false;

        System.out.println("!true  = " + (!c));
        System.out.println("!false = " + (!d));

        // --------------------------------------------------
        // Arithmetic Operator
        // --------------------------------------------------

        System.out.println("\nArithmetic Operator");

        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
        System.out.println(4 / 2 + 8 * 4 - (5 + 2) % 3);

        // --------------------------------------------------
        // Relational Operator
        // --------------------------------------------------

        System.out.println("\nRelational Operator");

        System.out.println(5 < 2);
        System.out.println(1 == 1);
        System.out.println(1 == 2);
        System.out.println(2 != 1);
        System.out.println(3 > 3);
        System.out.println(3 >= 3);

        // --------------------------------------------------
        // Logical Operator
        // --------------------------------------------------

        System.out.println("\nLogical Operator");

        System.out.println(1 < 2 && 3 < 5);
        System.out.println(true && false);

        System.out.println(1 > 2 || 3 < 5);
        System.out.println(true || false);

        System.out.println(1 > 2 ^ 3 < 5);
        System.out.println(true ^ false);

        // --------------------------------------------------
        // Bitwise Operator
        // --------------------------------------------------

        System.out.println("\nBitwise Operator");

        System.out.println("12 & 25 = " + (12 & 25));
        System.out.println("12 | 25 = " + (12 | 25));
        System.out.println("5 ^ 7   = " + (5 ^ 7));

        // --------------------------------------------------
        // Assignment Operator
        // --------------------------------------------------

        int num = 2;

        System.out.println("\nAssignment Operator");

        System.out.println(num += 4);

        System.out.println(num -= 4);

        System.out.println(num *= 4);

        System.out.println(num /= 4);

        System.out.println(num %= 2);

        input.close();

    }

}