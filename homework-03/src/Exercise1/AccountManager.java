package Exercise1;

public class AccountManager {

    public void testAccess(Account acc) {
        System.out.println(acc.owner); // public - accessible
        // System.out.println(acc.balance); // private - not accessible
        System.out.println(acc.pin); // protected - accessible in same package
        System.out.println(acc.internalNote); // package-private - accessible in same package
    }
}
