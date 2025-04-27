// Comando concreto: salvar mensagem
class SaveMessageCommand implements Command {
    private String message;

    public SaveMessageCommand(String message) {
        this.message = message;
    }

    public void execute() {
        System.out.println("Salvando mensagem: " + message);
    }

    public void undo() {
        System.out.println("Removendo mensagem salva: " + message);
    }
}

