public class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        System.out.println(" is checking balance");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.print(name);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        System.out.println(" is withdrawing " + amount);
    }
}
