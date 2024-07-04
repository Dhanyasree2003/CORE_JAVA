package Corejava.Oops;

class Multilevel1
{
    public void transaction()
    {
        long accNo=12345678901l;
        String Accholder="DhanyaSree";
        String AccSatus="Active";
        System.out.println("Account Number: "+accNo);
        System.out.println("Account status: "+AccSatus);
        System.out.println("Accontholder: "+Accholder);
    }
}
class customers extends  bank
{
    public  void Balance()
    {
        int amount=200000;
        int amt=90000;
        int result=amount+amt;
        System.out.println("Available Balance is: "+result);
    }
}
class Transaction extends customers
{
    public  void Details()
    {
        String Bankname="SBI";
        String Branch_name="Ammapet";
        System.out.println("Bank name is: "+Bankname);
        System.out.println("Branch Name is : "+Branch_name);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        customers cc = new customers();
        cc.Balance();
        cc.transaction();

        Transaction tt= new Transaction();
        tt.transaction();
        tt.Balance();
        tt.Details();
    }
}
