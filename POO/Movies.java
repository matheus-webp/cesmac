import java.util.ArrayList;
import java.util.Scanner;

public class Movies implements Cinema {
    Scanner scanner = new Scanner(System.in);
    private String movie;
    public final static ArrayList<String> MOVIES = new ArrayList<>();

    static {
        MOVIES.add("O Lobo de Wall Street");
        MOVIES.add("Prenda-me se for capaz");
        MOVIES.add("Django Livre");
        MOVIES.add("Inception");
    }

    @Override
    public void show() {
        for (int i = 0; i < MOVIES.size(); i++) {
            System.out.printf("%d - %s\n",i+1,MOVIES.get(i));
        };
    }

    public String movieSelection(){
        while (true){
            System.out.println("Selecione um dos seguintes filmes: ");
            System.out.println("Digite 0 para sair");
            this.show();
            int selectedMovie = this.scanner.nextInt();

            if(selectedMovie == 0){
                break;
            }

            try {
                movie = this.getMovie(selectedMovie - 1);
                break;
            }
            catch (Exception e){
                System.out.println("Selecione uma opção válida!");
            }
        }
    return movie;
    }

    private String getMovie(int index){
        return MOVIES.get(index);
    }
}
