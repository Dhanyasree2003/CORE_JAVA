package Corejava.operators;

import java.util.Scanner;

public class scanner_operators {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("enter the value of 1: ");
        int data=Scan.nextInt();
        System.out.println("enter the value of 2:");
        int data1=Scan.nextInt();
        int result=data+data1;
        System.out.println("result is: "+result);

    }
}
