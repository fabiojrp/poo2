// Comando concreto: imprimir mensagem
class PrintMessageCommand implements Command {
    private String message;

    public PrintMessageCommand(String message) {
        this.message = message;
    }

    public void execute() {
        System.out.println("Mensagem: " + message);
    }

    public void undo() {
        System.out.println("Desfazendo impressão: " + message);
    }
}