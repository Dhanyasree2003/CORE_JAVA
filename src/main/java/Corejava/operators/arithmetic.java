package Corejava.operators;

public class arithmetic {
    public void addition(){
        int flower=400;
        int veggies=300;
        System.out.println(flower+veggies);
    }
    public static void main(String[] args) {
        int onion=70;
        int meat=500;
        System.out.println(onion+meat);
        System.out.println(onion-meat);
        int brinjal=60;
        int cabbage=80;
        System.out.println((onion*brinjal));
        System.out.println(meat/cabbage);
        System.out.println((cabbage%meat));
        arithmetic yr=new arithmetic();
        yr.addition();
    }
}
