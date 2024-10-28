import java.util.ArrayList;
import java.util.Scanner;

public class Session implements Cinema{
    Scanner scanner = new Scanner(System.in);
    private String session;
    public final static ArrayList<String> SESSIONS = new ArrayList<>();

    static {
        SESSIONS.add("12:00");
        SESSIONS.add("15:00");
        SESSIONS.add("18:00");
        SESSIONS.add("22:00");
    }

    @Override
    public void show() {
        for (int i = 0; i < SESSIONS.size(); i++) {
            System.out.printf("%d - %s\n", i+1, SESSIONS.get(i));
        }
    }

    public String sessionsSelection(){
        while (true) {
            System.out.println("Digite 0 para sair");
            this.show();
            int sessionSelected = scanner.nextInt();

            if(sessionSelected == 0){
                session = null;
                break;
            }

            try {
                session = this.getSession(sessionSelected - 1);
                break;
            } catch (Exception e){
                System.out.println("Selecione uma opção válida!");
            }
        }
        return session;
    }

    private String getSession(int index){
        return SESSIONS.get(index);
    }

}
