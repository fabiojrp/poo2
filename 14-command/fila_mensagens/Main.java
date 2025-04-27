public class Main {
    public static void main(String[] args) {
        CommandQueue queue = new CommandQueue();

        queue.addCommand(new PrintMessageCommand("Olá, mundo!"));
        queue.addCommand(new SaveMessageCommand("Mensagem importante"));
        queue.addCommand(new PrintMessageCommand("Fim do exemplo."));

        queue.processCommands();

        System.out.println("\nDesfazendo últimas ações:");
        queue.undoLast();
        queue.undoLast();
    }
}
