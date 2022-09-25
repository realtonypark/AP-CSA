public class BankAccount{
    //attributes
    private String password;
    private double balance;
    public static final double OVERDRAWN_PENALTY = 20.00;

    //constructors
    public BankAccount(){ 
        this.password = "";
        this.balance = 0.0;
    }

    public BankAccount(String acctPassword, double acctBalance){
        this.password = acctPassword;
        this.balance = acctBalance;
    }

    //accessor
    public double getBalance(){
        return this.balance;
    }

    public String getPassword(){
        return this.password;
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
    public static void chargeFee(BankAccount b, String password, double fee){
        final double MAX_VALUE = 1000.00;
        if(b.getBalance() < MAX_VALUE){
            b.withdraw(password, fee);
        }
    }
    public static BankAccount choooseBestAccount(BankAccount ba1, BankAccount ba2){
        // BankAccount better = null;
        if(ba1.getBalance() < ba2.getBalance()){
            // better = ba2;
            return ba2;
        }
        else{
            // better = ba1;
            return ba1;
        }
        // return better;
    }

    public static BankAccount choooseBestAccount2(BankAccount ba1, BankAccount ba2){
        BankAccount better = null;
        if(ba1.getBalance() < ba2.getBalance()){
            better = new BankAccount(ba2.getPassword(),ba2.getBalance());
        }
        else{
            better = new BankAccount(ba1.getPassword(),ba1.getBalance());
        }
        return better;
    }
}