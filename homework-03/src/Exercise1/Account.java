package Exercise1;

public class Account {

    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }

    public double getBalance() {
        return balance;
    }

    public void changePin(int currentPin, int newPin) {
        if (currentPin == this.pin) {
            this.pin = newPin;
        } else {
            System.out.println("False pin");
        }
    }

}
