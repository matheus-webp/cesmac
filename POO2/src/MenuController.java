import java.util.Scanner;

public class MenuController {
    static {
        FilmeFactory filmeFactory = new FilmeFactory();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();

        while (true) {
            System.out.println("Selecione um dos seguintes filmes para ver detalhes e prosseguir com a compra do ingresso: ");
            Filme.showMovies();
            int movieIndex = scanner.nextInt();
            Filme movie = Filme.getMovie(movieIndex - 1);

            if (movie == null) {
                continue;
            }

            Filme.showMovieDetails(movie);
            ingresso.setMovie(movie);

            System.out.println("\nSelecione um dos seguintes horários:\n1 - 10h\n2 - 15h\n3 - 20h\n");
            int timeSelected = scanner.nextInt();
            String ticketSelected = ingresso.setTime(timeSelected);

            if (ticketSelected == null) {
                continue;
            }

            System.out.println("Selecione o tipo de ingresso:\n1 - Inteira\n2 - Meia");
            int ticketType = scanner.nextInt();
            System.out.println("Digite a quantidade de ingressos: (1 - 99)");
            int ticketQuantity = scanner.nextInt();
            if (ticketQuantity < 1 || ticketQuantity > 99) {
                System.out.println("Digite uma quantidade válida!");
                continue;
            }

            double value = ingresso.buyTicket(ticketType, ticketQuantity);

            if (value == 0) {
                continue;
            }

            ingresso.showTicket(value);
            break;

        }

    }
}
