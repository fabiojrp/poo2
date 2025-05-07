public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        System.out.println("=== Rota de Carro ===");
        navigator.setStrategy(new CarStrategy());
        navigator.buildRoute("Centro", "Shopping");

        System.out.println("\n=== Rota de Ônibus ===");
        navigator.setStrategy(new BusStrategy());
        navigator.buildRoute("Estação", "Universidade");

        System.out.println("\n=== Rota a Pé ===");
        navigator.setStrategy(new WalkStrategy());
        navigator.buildRoute("Parque", "Museu");
    }
}