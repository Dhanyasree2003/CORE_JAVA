package Corejava.operators;

public class assignment_operator {
    public static void main(String[] args) {
        int tea=90;
        int coffe=110;
        int black_coffe=200;
        int milkshake=500;
        System.out.println(tea+=black_coffe);// assignment
        System.out.println(milkshake-=coffe);
        System.out.println("the combo of tea and coffee is :"+(tea*=coffe));
    }
}
