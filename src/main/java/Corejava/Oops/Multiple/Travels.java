package Corejava.Oops.Multiple;

public class Travels extends BusLocation implements Bus,TravelsName {
    public void distance()
    {
        System.out.println("My bus travels is  only long dustance ");
    }

    public static void main(String[] args) {
        Travels t = new Travels();
        t.distance();
        t.T_Names();
        t.Travels();
        t.Location();

    }

    @Override
    public void Travels() {
        System.out.println("Kerala Express");
    }

    @Override
    public void T_Names() {
        System.out.println("Swamy Ayyappa Travels");

    }
}
