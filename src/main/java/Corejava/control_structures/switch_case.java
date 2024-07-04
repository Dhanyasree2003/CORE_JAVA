package Corejava.control_structures;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER YOUR WORKING DAYS");
        String days= scan.nextLine();
        switch (days) {
            case "MONDAY":
                System.out.println("Monday is a working day");
                break;
            case "TUESDAY":
                System.out.println("Tuesday is a working day");
                break;
            case "WEDNESDAY":
                System.out.println("Wednesday is a working day");
                break;
            case "THURSDAY":
                System.out.println("Thursday is a working day");
                break;
            case "FRIDAY":
                System.out.println("Friday is a working day");
            default:
                System.out.println("It's a Holiday");
                break;
            }
        }
    }


