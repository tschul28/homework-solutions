package Exercise3;

import java.util.List;

public class Inbox {

    private List<Mail> mails;

    public Inbox(List<Mail> mails) {
        this.mails = mails;
    }

    public void printHeader() {
        for (Mail m : this.mails) {
            m.printDetails();
        }

    }

    public void open(int index) {
        if (index < 0 || index >= this.mails.size()) {
            System.out.println("Invalid mail index.");
            return;
        }
        Mail mail = this.mails.get(index);
        mail.print();
        mail.setRead(true);
    }

    public int countUnread() {
        int count = 0;
        for (Mail m : this.mails) {
            if (!m.isRead()) {
                count++;
            }
        }
        return count;
    }

    public List<Mail> getMails() {
        return mails;
    }

    public void setMails(List<Mail> mails) {
        this.mails = mails;
    }

}
