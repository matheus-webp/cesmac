import java.util.Scanner;
import java.util.HashMap;

public class Ticket {
    private HashMap<TicketOption, Double> ticket = new HashMap<>();
    private TicketOption ticketOption;
    private int quantity;
    public double value;

    public void ticketSelection() {
        Scanner scanner = new Scanner(System.in);

        boolean looping = true;
        while (looping) {
            System.out.println("Escolha o tipo do ingresso:\n 1 - Inteira\n 2 - Meia");
            int ticketType = scanner.nextInt();
            System.out.println("Digite a quantidade de ingressos :");
            int ticketQuantity = scanner.nextInt();
            if(ticketQuantity < 1){
                System.out.println("A quantidade precisa ser igual ou maior que 1 ingresso");
                continue;
            }

            switch (ticketType) {
                case 1:
                    ticketOption = TicketOption.INTEIRA;
                    this.value = totalValueCalculate(ticketQuantity, ticketOption);
                    this.ticket.put(ticketOption, value);
                    looping = false;
                    break;
                case 2:
                    ticketOption = TicketOption.MEIA;
                    this.value = totalValueCalculate(ticketQuantity, ticketOption);
                    this.ticket.put(ticketOption, value);
                    looping = false;
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
            }
        }
    }

    private double totalValueCalculate(int quantity, TicketOption ticketOption){
      double value = quantity * ticketOption.getPrice();
      return value;
    }

    public double getValue(){
        return this.value;
    }

    public HashMap<TicketOption, Double> getTicket() {
        return ticket;
    }
}
