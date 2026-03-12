package Task05;

public class Notification {
    public void send(){
        System.out.println("You have 3 new notifications.");
    }

    public static void main(String[] args) {
        Notification e = new EmailNotification();
        Notification s = new SMSNotification();
        Notification p = new PushNotification();

        e.send();
        s.send();
        p.send();
    }
}

class EmailNotification extends Notification{
    @Override
    public void send() {
        System.out.println("You have 3 unread emails in inbox.");
    }
}

class SMSNotification extends Notification{
    @Override
    public void send() {
        System.out.println("You have 3 unread SMS in inbox.");
    }
}

class PushNotification extends Notification{
    @Override
    public void send() {
        System.out.println("You have 3 unread Push notifications in inbox.");
    }
}