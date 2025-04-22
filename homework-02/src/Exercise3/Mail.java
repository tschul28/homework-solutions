package Exercise3;

import java.time.LocalDateTime;

public class Mail {

    private String sender;
    private String subject;
    private String message;
    private LocalDateTime datetime;
    private boolean read;

    public void print() {
        System.out.println(this.subject + " from " + this.sender + " on " + this.datetime + ": " + this.message);
    }

    public void printDetails() {
        System.out.println(this.read + " | " + this.subject + " | " + this.sender + ": " + this.datetime + "\n");
    }

    public Mail(String sender, String subject, String message, LocalDateTime datetime, boolean read) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.read = read;
    }

    public String getsender() {
        return sender;
    }

    public void setsender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

}
