package Corejava.control_structures;

import java.util.Scanner;

public class ELECTION
{
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scan= new Scanner(System.in);
        int age= scan.nextInt();
        if (age >= 18)

        {
            System.out.println("YOU ARE ELIGIBLE FOR VOTING");
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING");
        }
    }
}
