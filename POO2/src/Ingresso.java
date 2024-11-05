public class Ingresso {
    public Filme filme;
    public TipoIngresso tipoIngresso;
    public String horario;

    public void setMovie(Filme filme) {
        this.filme = filme;
    }

    public String setTime(int index) {
        return switch (index) {
            case 1 -> {
                this.horario = "10h";
                yield horario;
            }
            case 2 -> {
                this.horario = "15h";
                yield horario;
            }
            case 3 -> {
                this.horario = "20h";
                yield horario;
            }
            default -> {
                System.out.println("Selecione uma opção válida!");
                yield null;
            }
        };
    }

    public double buyTicket(int ticketType, int ticketQuantity) {
        return switch (ticketType) {
            case 1 -> {
                this.tipoIngresso = TipoIngresso.INTEIRA;
                yield calculateValue(tipoIngresso.getPreco(), ticketQuantity);
            }
            case 2 -> {
                this.tipoIngresso = TipoIngresso.MEIA;
                yield calculateValue(tipoIngresso.getPreco(), ticketQuantity);
            }
            default -> {
                System.out.println("Selecione uma opção válida!");
                yield 0;
            }
        };
    }

    private double calculateValue(double price, int quantity) {
        return price * quantity;
    }

    public void showTicket(double value) {
        System.out.printf("Detalhes do ingresso:\nFilme: %s\nDuração: %s\nHorário: %s\nTipo de ingresso: %s\nValor: %.2f", this.filme.getNome(), this.filme.getDuracao(), this.horario, this.tipoIngresso, value);
    }


}
