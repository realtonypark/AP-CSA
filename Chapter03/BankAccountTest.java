public class BankAccountTest{
    public static void main(String[] args){
        final double FEE = 50.00;

        BankAccount b1 = new BankAccount("Park", 500.00);
        BankAccount b2 = new BankAccount("Seunghyeon", 800.00);
        BankAccount b3 = null;
        BankAccount andysAccount = new BankAccount("AndyS", 600.00);
        BankAccount briansFund = new BankAccount("BrianL", 800.00);
        BankAccount betterFund = null;

        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());
        
        b1.deposit("Park", 100);
        System.out.println(b1.getBalance());
        b1.withdraw("Park", 200);
        System.out.println(b1.getBalance());

        System.out.println(andysAccount.getBalance());
        BankAccount.chargeFee(andysAccount, "AndyS", FEE);
        System.out.println(andysAccount.getBalance());

        betterFund = BankAccount.choooseBestAccount(briansFund, andysAccount);
        System.out.println(betterFund.getBalance());

        betterFund = BankAccount.choooseBestAccount2(briansFund, andysAccount);
        System.out.println(betterFund.getBalance());        
    }
}