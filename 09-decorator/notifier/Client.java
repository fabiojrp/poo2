public class Client {
    public static void main(String[] args) {        
        
        Notifier notifier = new Notifier();
        //envia notificação apenas por email
        notifier.send("Olá pessoal do Email");

        notifier = new SMSDecorator(notifier);
        //envia notificação por email e sms
        notifier.send("Olá várias notificações");

        notifier = new SlackDecorator(new FacebookDecorator(notifier));
        //envia notificação por email, sms, slack e facebook
        notifier.send("Olá todas notificações");
    }
}
