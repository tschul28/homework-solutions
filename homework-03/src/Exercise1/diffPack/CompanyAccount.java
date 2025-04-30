package Exercise1.diffPack;

import Exercise1.Account;

public class CompanyAccount extends Account {

    public CompanyAccount(String owner, double balance, int pin, String note) {
        super(owner, balance, pin, note);
    }

    public void testAccess() {
        System.out.println(owner); // public - accessible
        // System.out.println(balance); // private - not accessible
        System.out.println(pin); // protected - accessible through inheritance
        // System.out.println(internalNote); // package-private - not accessible from
        // different package
    }

}
