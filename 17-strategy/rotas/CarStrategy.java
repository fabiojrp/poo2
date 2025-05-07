public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando rota de carro de " + start + " até " + end + ".");
        System.out.println("-> Utilizando rodovias e estradas.");
    }
}