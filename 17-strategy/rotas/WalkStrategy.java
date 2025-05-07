public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Calculando rota a pé de " + start + " até " + end + ".");
        System.out.println("-> Priorizando calçadas e travessias seguras.");
    }
}