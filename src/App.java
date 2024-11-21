
public class App {
    public static void main(String[] args) throws Exception {
        Festa festa = new Festa();

        festa.setPresente("play 5");
        festa.setBebidas(2);
        festa.setComidas(5);

        festa.verificaConvite("a51@asd");
        
        System.out.println(festa.getBebidas());
        System.out.println(festa.getPresente());
        System.out.println(festa.getComidas());
       
   
    }
}
