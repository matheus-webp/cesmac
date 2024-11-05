public enum TipoIngresso {
    INTEIRA(24),
    MEIA(12);

    private double preco;

    TipoIngresso(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
