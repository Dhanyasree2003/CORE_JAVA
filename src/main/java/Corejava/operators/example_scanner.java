package Corejava.operators;

import java.util.Scanner;

public class example_scanner {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("shopping list");
        System.out.println("enter the dress type: ");
        String type=Scan.nextLine();
        System.out.println("the price of dress; ");
        int price=Scan.nextInt();
        System.out.println("Offer price of the dress: ");
        int offer=Scan.nextInt();
        int total_price=(price-offer);
        System.out.println("the total price of the dress is: "+total_price);
        System.out.println("thanks for shopping");

    }

}
