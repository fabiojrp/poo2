import java.util.LinkedList;
import java.util.Queue;
// Gerenciador de fila de comandos
class CommandQueue {
    private Queue<Command> queue = new LinkedList<>();
    private LinkedList<Command> history = new LinkedList<>();

    public void addCommand(Command command) {
        queue.add(command);
    }

    public void processCommands() {
        while (!queue.isEmpty()) {
            Command command = queue.poll();
            command.execute();
            history.push(command); // Guarda para possível desfazer
        }
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nenhum comando para desfazer.");
        }
    }
}