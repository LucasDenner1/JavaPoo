public class Festa {
    private int bebidas;
    private int comidas;
    private String presente;
    private String codigoConvite = "a51@asd";


    public void verificaConvite(String convite){
        if(codigoConvite == convite){
            System.out.println("Convite verificado!");
            System.out.format("Seu presente foi %s, trouxe %d bebida(s) e %d comida(s), obrigado!\n",presente,bebidas,comidas);
        }else{
            System.out.println("Erro: Convite inválido!");
        }
    }


    public String getPresente(){
        return presente;
    }

    public void setPresente(String presente){
        this.presente = presente;
    }

    public int getBebidas(){
        return bebidas;
    }

    public void setBebidas(int bebidas){
        this.bebidas = bebidas ;
    }

    public int getComidas(){
        return comidas;
    }

    public void setComidas(int comidas){
        this.comidas = comidas;
    }

}
