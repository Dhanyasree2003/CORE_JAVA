package Corejava.operators;

public class logical_operator {//results in TRUE or FALSE
    public static void main(String[] args) {
        int val1=700;
        int val2=900;
        int val3=1000;
        String loc_1="salem";
        String loc_2="cbe";
        String loc_3="chennai";
        System.out.println((val2>=val1)&&(val2!=val1));
        System.out.println(loc_1==loc_3);
        System.out.println(val3>=val2);
        System.out.println(!(loc_3==loc_2));
    }
}
