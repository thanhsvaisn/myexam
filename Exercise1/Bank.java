package Exercise1;

public class Bank {
    private double balance;
    private double rate;
    public Bank(double balance, double rate) {
        this.rate = rate;
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double CalculateInterest(){
        return balance * (rate / 1200);
    }
}
