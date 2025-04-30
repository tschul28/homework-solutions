package Exercise2;

public class Main {

    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();
        System.out.println(m1.getType()); // Email
        System.out.println(m2.getType()); // SMS
        // m1.send(); // method send() is undefined for the type Message
    }

}
