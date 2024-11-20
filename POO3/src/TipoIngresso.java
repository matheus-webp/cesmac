public enum TipoIngresso {
    INTEIRA(24),
    MEIA(12),
    INTEIRA_VIP(48),
    MEIA_VIP(24);

    private double preco;

    TipoIngresso(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
