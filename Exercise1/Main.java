package Exercise1;

public class Main {
    public static void main(String[] args) {
    Bank bank = new Bank(1000,10);
    double result = bank.CalculateInterest();
        System.out.println("monthly interest rate is :"+result + " USD");
    }
}
