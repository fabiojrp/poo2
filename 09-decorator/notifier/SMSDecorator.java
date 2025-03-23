public class SMSDecorator extends BaseDecorator{
    
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void send(String message) {
        notifier.send(message);
        System.out.println("Sending SMS");
    }
    
}
