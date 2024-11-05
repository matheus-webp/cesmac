import java.util.ArrayList;

public class Filme {
    private static final ArrayList<Filme> filmes = new ArrayList<>();
    private final String nome;
    private final String diretor;
    private final String descricao;
    private final String genero;
    private final String duracao;

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public Filme(String nome, String diretor, String descricao, String genero, String duracao) {
        this.nome = nome;
        this.diretor = diretor;
        this.descricao = descricao;
        this.genero = genero;
        this.duracao = duracao;
    }

    public static void addMovie(Filme filme) {
        filmes.add(filme);
    }

    public static Filme getMovie(int index){
        try {
            return filmes.get(index);
        } catch (Exception e) {
            System.out.println("Selecione uma opção válida!");
            return null;
        }
    }

    public static void showMovieDetails(Filme i) {
            System.out.printf("\nNome: %s\nDiretor: %s\nDescrição: %s\nGênero: %s\nDuração: %s\n", i.nome, i.diretor, i.descricao, i.genero, i.duracao);
    }

    public static void showMovies(){
        for (int i = 0; i < filmes.size(); i++) {
            Filme filme = filmes.get(i);
            System.out.printf("\n%d - %s\nDuração: %s\n",i+1,filme.nome, filme.duracao);
        }
    }
}
