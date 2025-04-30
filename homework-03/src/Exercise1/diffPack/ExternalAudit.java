package Exercise1.diffPack;

import Exercise1.Account;

public class ExternalAudit {
    public void testAccess(Account acc) {
        System.out.println(acc.owner); // public - accessible
        // System.out.println(acc.balance); // private - not accessible
        // System.out.println(acc.pin); // protected - not accessible outside package
        // unless subclass
        // System.out.println(acc.internalNote); // package-private - not accessible
        // from different package
    }

}
