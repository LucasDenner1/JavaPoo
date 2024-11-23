import animais.Cachorro;
import animais.Dragao;

public class App {
    public static void main(String[] args) throws Exception {
   
        Cachorro pincher = new Cachorro("Leona", "Caramelo");
        Dragao dragao = new Dragao("Ernesto");

        pincher.caracteristicas();
        pincher.comer();
        pincher.beber();
        pincher.lamber();
        pincher.latir();

        dragao.caracteristicas();
        dragao.comer();
        dragao.beber();
        dragao.voar();
    }
}
