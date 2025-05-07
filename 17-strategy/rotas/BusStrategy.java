public class BusStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando rota de ônibus de " + start + " até " + end + ".");
        System.out.println("-> Considerando linhas e horários de ônibus.");
    }
}