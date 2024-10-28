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


        TicketOption ticketOption = ticket.ticketSelection();
        System.out.printf("Detalhes do bilhete:\nFilme: %s\nSessão: %s\nEntrada: %s\nValor: %.2f", movie, sessionSelected, ticketOption, ticketOption.getPrice());
        System.out.println("Boleto para pagamento: ");

    }
}
