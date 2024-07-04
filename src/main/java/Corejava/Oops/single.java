package Corejava.Oops;


class bank1 {
    public void transaction()
    {
        String Accholder="Dhanyasree";
        long AccNo=3244526628383883l;
        System.out.println("Account HolderName"+Accholder);
        System.out.println("Account Number "+AccNo);


    }
}

class customer1 extends  bank1 {
    public void bank_details() {
        String Bank_name = "Kotak Mahindra";
        String Branch_name = "Ammapet";
        System.out.println("Bank name is:" + Bank_name);
        System.out.println("Branch name is :" + Branch_name);
    }

}
public class single {
    public static void main(String[] args) {
        customer1 cc= new customer1();
        cc.bank_details();
        cc.transaction();

    }

}
