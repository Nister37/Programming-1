package Ex02.ex02bankaccount;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;

    public BankAccount(String holder, String iban, double balance) {
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }
    public BankAccount(String holder, String iban) {
        this.balance = 0;
    }

    public String get_holder(){
        return holder;
    }
    public String get_iban(){
        return iban;
    }
    public double get_balance(){
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public boolean withdraw(double amount){
        if (amount <= this.balance){
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "The account " + this.iban + " of " + this.holder + " has a balance of € " + this.balance;
    }
}
