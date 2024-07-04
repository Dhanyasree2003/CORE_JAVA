package Corejava.control_structures;

import java.util.Scanner;

public class ELECTION_ELSEIF {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your age");
        int A1 = ss.nextInt();
        if (A1 >= 18)
        {
            System.out.println("YOU ARE ELIGIBLE FOR VOTING:"+A1);
            System.out.println("MAKE SURE YOU HAVE VOTER ID");
        } else if (A1<18) {
            System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING");
        } else {
            System.out.println("NO RESULTS FOUND");
        }
    }
}
