import Jogos.Jogo;

public class Console {

    private boolean botaoPower;
    private boolean temJogo;
    
    public void ligarConsole(){
        System.out.println("O console está sendo iniciado!");
        this.botaoPower = true;
    }
    
    public void escolhendoJogo(Jogo jogo){
        if (botaoPower) {
            jogo.jogar();
            this.temJogo = true;
        }
        else{
            System.out.println("Console não está ligado! ");
        }
    }

    public void desligarConsole(Jogo jogo){

        if (botaoPower ){
            if (temJogo) {
                jogo.fecharJogo();
            }
            System.out.println("Desligando..");
        }
        else{
            System.out.println("Console não está ligado! ");
        }
        
    }

}
