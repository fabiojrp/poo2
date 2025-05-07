public class Navigator {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String start, String end) {
        if (strategy == null) {
            System.out.println("Nenhuma estratégia de rota definida.");
        } else {
            strategy.buildRoute(start, end);
        }
    }
}