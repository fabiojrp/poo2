public class SlackDecorator extends BaseDecorator {
    
    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void send(String message) {
        notifier.send(message);
        System.out.println("Sending Slack message");
    }
}
