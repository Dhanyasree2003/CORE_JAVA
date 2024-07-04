package Corejava.control_structures;

import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide you Cutoff Details");
        int cutoff = scan.nextInt();
        if (cutoff <= 180) {
            System.out.println("CONGRATS!,you are eligible for engineering");
            Scanner scan1 = new Scanner(System.in);
            System.out.println("TO KNOW WHETHER U R ELIGIBLE FOR BOTH MEDICINE AND ENGINEERING");
            System.out.println("enter your 10th percentage");
            int percentage = scan.nextInt();
            System.out.println("enter your cutoff1");
            int cutoff1= scan.nextInt();
            if (percentage > 90 && cutoff1 >=180 ) {
                System.out.println("CONGRATULATIONS!,you are eligible for both medicine and engineering");
                System.out.println("ALL THE BEST");
            } else {
                System.out.println("sorry,you are eligible for engineering ONLY");
            }
        }
            else
            {
                System.out.println("You have high chances of getting your engineering seats in COUNSELLING quota");
            }



    }
}
