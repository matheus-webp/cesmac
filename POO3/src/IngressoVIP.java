public class IngressoVIP extends Ingresso {
    @Override
    public void acessoLanchonete() {
        System.out.println("Lanchonete do cinema liberada");
    }

    @Override
    public double buyTicket(int ticketType, int ticketQuantity) {
        return switch (ticketType) {
            case 1 -> {
                this.tipoIngresso = TipoIngresso.INTEIRA_VIP;
                yield super.calculateValue(tipoIngresso.getPreco(), ticketQuantity);
            }
            case 2 -> {
                this.tipoIngresso = TipoIngresso.MEIA_VIP;
                yield super.calculateValue(tipoIngresso.getPreco(), ticketQuantity);
            }
            default -> {
                System.out.println("Selecione uma opção válida!");
                yield 0;
            }
        };
    }
}
