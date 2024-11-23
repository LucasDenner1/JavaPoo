import animais.Cachorro;
import animais.Dragao;

public class App {
    public static void main(String[] args) throws Exception {
   
        Cachorro pincher = new Cachorro("Leona", "Caramelo");
        Dragao dragao = new Dragao("Ernesto");

        System.out.println(pincher);
        pincher.comer();
        pincher.beber();
        pincher.lamber();
        pincher.latir();

        System.out.println(dragao);
        dragao.comer();
        dragao.beber();
        dragao.voar();
    }
}
