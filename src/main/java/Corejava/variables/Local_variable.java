package Corejava.variables;

public class Local_variable {
    public void Sweets() {//local variables//method created
        int price = 500;
        String name = "chocolates";
        String type = "dark";
        System.out.println("the type of chocolate is "+type);
        System.out.println("the price of chocolate is "+price);
    }
public static void main(String args[])
{
    Local_variable hi = new Local_variable();
    hi.Sweets();
}
}
