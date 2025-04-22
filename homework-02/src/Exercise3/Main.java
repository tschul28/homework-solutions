package Exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mail mail1 = new Mail("alice@example.com", "subject1", "message1",
                LocalDateTime.now().minusDays(1), false);
        Mail mail2 = new Mail("bob@example.com", "subject2", "message2", LocalDateTime.now().minusHours(3),
                false);
        Mail mail3 = new Mail("carol@example.com", "subject3", "message3",
                LocalDateTime.now().minusMinutes(45), false);

        List<Mail> mailList = new ArrayList<>();
        mailList.add(mail1);
        mailList.add(mail2);
        mailList.add(mail3);

        Inbox inbox = new Inbox(mailList);

        System.out.println("Inbox Headers:");
        inbox.printHeader();

        System.out.println("Unread emails: " + inbox.countUnread());

        System.out.println("\nOpening email at index 1:");
        inbox.open(1);
        System.out.println("\nUnread emails: " + inbox.countUnread());
    }
}
