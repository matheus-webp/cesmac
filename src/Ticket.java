import java.util.Scanner;

public class Ticket {
    private TicketOption ticketOption;

    public TicketOption ticketSelection() {
        Scanner scanner = new Scanner(System.in);
        boolean looping = true;
        while (looping) {
            System.out.println("Digite 0 para sair");
            System.out.println("Escolha o tipo do ingresso:\n 1 - Inteira\n 2 - Meia");

            int ticketType = scanner.nextInt();

            switch (ticketType) {
                case 0:
                    System.out.println("Compra de ingressos encerrada!");
                    looping = false;
                    break;
                case 1:
                    ticketOption = TicketOption.INTEIRA;
                    looping = false;
                    break;
                case 2:
                    ticketOption = TicketOption.MEIA;
                    looping = false;
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
            }
        }
        return ticketOption;

    }

    public TicketOption getTicketOption() {
        return this.ticketOption;
    }
}
