package Corejava.control_structures;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your weight");
        int w1 = ss.nextInt();
        if ((w1 >= 20) && (w1 <= 40)) {
            System.out.println("your weight is under weight");
            System.out.println("EAT WELL");
        } else if (w1 == 65) {
            System.out.println("your weight is normal");
        } else if (w1 >= 90) {
            System.out.println("your weight is over weight");
            System.out.println("MEET YOUR DOCTOR");
        } else {
            System.out.println("please measure your weight");
        }
    }
}