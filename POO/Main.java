import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Movies movies = new Movies();
        Session session = new Session();
        Ticket ticket = new Ticket();

        String movie = movies.movieSelection();

        if (movie == null) {
            System.out.println("Compra de ingressos encerrada!");
            return;
        }

        System.out.printf("Escolha uma sessão para o filme %s: \n", movie);
        String sessionSelected = session.sessionsSelection();
        if (sessionSelected == null) {
            System.out.println("Compra de ingressos encerrada!");
            return;
        }


        ticket.ticketSelection();
        HashMap<TicketOption, Double> ticketMap = ticket.getTicket();
        TicketOption ticketOption = ticketMap.keySet().iterator().next();
        double value= ticket.getValue();

        System.out.printf("Detalhes do bilhete:\nFilme: %s\nSessão: %s\nEntrada: %s\nValor: %.2f\n", movie, sessionSelected, ticketOption, value);
    }
}
