public class Console {

    private boolean botaoPower;
    private boolean temJogo;
    
    public void ligarConsole(){
        System.out.println("O console está sendo iniciado!");
        this.botaoPower = true;
    }
    
    public void escolhendoJogo(){
        if (botaoPower) {
            this.temJogo = true;
        }
        else{
            System.out.println("Console não está ligado! ");
        }
    }

    public void desligarConsole(){

        if (botaoPower ){
            if (temJogo) {
                
            }
            System.out.println("Desligando..");
        }
        else{
            System.out.println("Console não está ligado! ");
        }
        
    }

}
