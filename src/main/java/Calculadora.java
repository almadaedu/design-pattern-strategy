class Calculadora {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executarOperacao(int a, int b) {
        return strategy.executarOperacao(a, b);
    }
}