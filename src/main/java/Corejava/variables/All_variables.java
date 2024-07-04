package Corejava.variables;

public class All_variables
{
    static String deaprtment="i m currently persuing EEE";//declare static
    String level="state level dancer"; //declare global variable
    int prize= 1;
    public void Intro()//method created for local variable
    {
        int cutoff=179;
        String passion="dance";
        System.out.println("my cutoff is: "+cutoff);//print local variable
        System.out.println("my passion is "+passion);
        System.out.println("I m a "+level);//print global variable
        System.out.println("I secured"+prize);
        System.out.println("Dhanya_sree2003");
    }

    public static void main(String[] args)
    {
        System.out.println(deaprtment);//static variable
        double cgpa=8.0;//instance variable
        String college="i m a sona student";
        System.out.println(college);
        System.out.println("My cgpa is: "+cgpa);
        All_variables tr=new All_variables();
        tr.Intro();

    }
}

