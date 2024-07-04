package Corejava.control_structures;

import java.util.Scanner;

public class CALCI {

    public static void main(String[] args) {
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        char operation= '+';
        Scanner scan1=new Scanner(System.in);
        char operation1='-';
        System.out.println("Enter first number");
        double number_1=scan.nextDouble();
        System.out.println("Enter second number");
        double number_2= scan.nextDouble();
        double result=0.00000;

                switch (operation) {


                    case '+':
                        result = number_1 + number_2;
                        System.out.println(number_1 + " + " + number_2 + " = " + result);
                        break;

                    case '-':
                        result = number_1 - number_2;
                        System.out.println(number_1 + " - " + number_2 + " = " + result);
                        break;

                    case '*':
                        result = number_1 * number_2;
                        System.out.println(number_1 + " * " + number_2 + " = " + result);
                        break;

                    case '/':
                        result = number_1 / number_2;
                        System.out.println(number_1 + " / " + number_2 + " = " + result);
                        break;

                    default:
                        System.out.println("Invalid operator!");
                        break;
                }

            }
        }
    }

