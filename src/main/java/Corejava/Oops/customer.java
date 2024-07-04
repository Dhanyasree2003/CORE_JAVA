package Corejava.Oops;

public class customer extends  bank {
    public void bank_details()
    {
        String Bank_name="Kotak Mahindra";
        String Branch_name="Ammapet";
        System.out.println("Bank name is:"+Bank_name);
        System.out.println("Branch name is :"+Branch_name);
    }
    public static void main(String[] args) {
        customer cc = new customer();
        cc.transaction();
        cc.bank_details();
    }
}
