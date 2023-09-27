public class Customer extends Thread{
    private String name;
    private int amount;
    private ATM atm;

    public Customer(String name, int amount, ATM atm) {
        this.name = name;
        this.amount = amount;
        this.atm = atm;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}
