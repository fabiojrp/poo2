package sistemalogistica;

public abstract class Logistic {
	
		
	public void doLogistic() {
		System.out.println("Iniciando processo de logística");
		Transport transport = createTransport();
		transport.deliver();
	}
	
	public abstract Transport createTransport();
}