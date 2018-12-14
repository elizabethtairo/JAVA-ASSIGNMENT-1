public class Account {
    private int accountNumber;
    private double balance = 0.0;

    public Account(int accNo ,double bal){
        accountNumber=accNo;
        balance=bal;
    }
    public Account(int accNo){
        accountNumber=accNo;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

public void credit(double amount){
        double sum;
        sum = amount + balance;
}

public void debit(double amount){
        double sub;
        if (balance >= amount){
            sub = balance-amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
}

    @Override
    public String toString() {
        return ("A/C no:, Balance=$xxx.xx");
    }
}

