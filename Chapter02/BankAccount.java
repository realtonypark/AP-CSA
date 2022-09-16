public class BankAccount{
    //attributes
    private String password;
    private double balance;
    public static final double OVERDRAWN_PENALTY = 20.00;

    //constructors
    public BankAccount(){ 
        password = "";
        balance = 0.0;
    }

    public BankAccount(String acctPassword, double acctBalance){
        password = acctPassword;
        balance = acctBalance;
    }

    //accessor
    public double getBalance(){
        return balance;
    }

    //modifiers
    public void deposit(String acctPassword, double amount){
        /* 
        if(password == acctPassword){
            balance += amount;
        }
        else{
            System.out.println("Password for the account is wrong");
        }
        */
        if(!acctPassword.equals(password)){
            System.out.println("Password for the account is wrong");
        }
        else{
            balance += amount;
        }
    }

    public void withdraw(String acctPassword, double amount){
        /* 
        if(password == acctPassword){
            if(balance < amount){
                System.out.println("Penalty");
            }
            else{
                balance -= amount;
            }
        }
        else{
            System.out.println("Password for the account is wrong");
        }
        */
        if(!acctPassword.equals(password)){
            System.out.println("Password for the account is wrong");
        }
        else{
            balance -= amount;
            if(balance<0){
                balance -= OVERDRAWN_PENALTY;
            }
        }
    }

    public static void choooseBestAccount(){
        
    }
        
}
