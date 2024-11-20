public class FilmeFactory {
    public FilmeFactory() {
        Filme djangoLivre = new Filme("DJango Livre", "Tarantino", " No sul dos Estados Unidos, o ex-escravo Django faz uma aliança inesperada com o caçador de recompensas Schultz para caçar criminosos e resgatar\n sua esposa de um fazendeiro que força seus escravos a participarem de competições mortais.", "Faroeste", "2h45m");
        Filme loboDeWallStreet = new Filme("O Lobo de Wall Street", "Martin Scorsese", "Conta a história de Jordan Belfort, um corretor de bolsa de valores que se tornou um dos nomes mais conhecidos do mercado financeiro norte-americano nos anos 1990.", "comédia dramático-biográfico-policial", "3h");
        Filme prendaMeSeForCapaz = new Filme("Prenda-me se for capaz", "Steven Spielberg", "Frank Abagnale Jr. (Leonardo DiCaprio) já foi médico, advogado e co-piloto, tudo isso com apenas 18 anos.\n Mestre na arte do disfarce, ele aproveita suas habilidades para viver a vida como quer e praticar golpes milionários, que fazem com que se torne o ladrão de banco mais bem-sucedido da história dos Estados Unidos com apenas 17 anos.\n Mas em seu encalço está o agente do FBI Carl Hanratty (Tom Hanks), que usa todos os meios que tem ao seu dispor para encontrá-lo e capturá-lo.", "comédia dramático-biográfica", "2h20m");

        Filme.addMovie(djangoLivre);
        Filme.addMovie(loboDeWallStreet);
        Filme.addMovie(prendaMeSeForCapaz);
    }
}
