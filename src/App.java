import Jogos.Dama;
import Jogos.Xadrez;

public class App {
    public static void main(String[] args) throws Exception {
    
        Xadrez xadrez = new Xadrez();
        Dama dama = new Dama();
        Console play2 = new Console();

        play2.ligarConsole();
        play2.escolhendoJogo(dama);
        play2.desligarConsole(dama);

    }
}
