public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Customer c1 = new Customer("Jack", 2000, atm);
        Customer c2 = new Customer("John", 2000, atm);

        c1.start();
        c2.start();
    }
}