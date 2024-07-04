package Corejava.variables;

public class global_variable //class
{
    int number = 111111111;
    String mother_name = "praseetha";
    String location = "salem";

    public void details() //method
    {
        System.out.println(number);
        System.out.println("the name of mother is " + mother_name);
    }

    public static void main(String[] args) {
        global_variable yu = new global_variable();
        yu.details();
    }
}