package Corejava.Oops;

class Heirarichal
    {
        String fname="Ssatheesh kumar";
        public void Mother() {
            String Mname="parseetha";
            System.out.println("Mother Name is: "+Mname);
            System.out.println("Father Name is : "+fname);
        }

    }

    class Self extends Heirarichal
    {
        public void Self()
        {
            String SNAME="Dhanya sree";
            System.out.println("My Name is : "+SNAME);
        }
    }
    class Dhanyasree extends  Heirarichal
    {
        public  void Lname()
        {
            String Lname="Shruthi";
            System.out.println(" Friend name is :"+Lname);
        }

        public static void main(String[] args) {
            Dhanyasree dd = new Dhanyasree();
            dd.Lname();
            dd.Mother();

            Self aa = new Self();
            aa.Self();

            }
}
