package utils;

import utils.MathUtil;

import java.util.Scanner;

public class CalculateUtil {
    public static double calculate() {
        Scanner sk = new Scanner(System.in);
        System.out.println("Hello dear customer!\nPlease insert your number:");
        double a = sk.nextDouble();
        System.out.println("Please insert transaction");
        char operation = sk.next().charAt(0);
        System.out.println("Please insert you second number:");
        double b = sk.nextDouble();

        double result=0;

        if (operation =='+') {
            result = MathUtil.plus(a,b);
        }else if (operation =='-') {
            result = MathUtil.minus(a,b);
        }else if (operation == '*') {
            result = MathUtil.multiplication(a,b);
        }else if (operation == '/') {
            result = MathUtil.divided(a,b);
        } else {
            System.out.println("Error 404, No such operation!");
        }
        System.out.println("The client entered the following operation:" + a + " " + operation + " " + b + " = " + result);
        return result;



    }
}
