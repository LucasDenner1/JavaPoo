public class Festa {
    private int bebidas = 60;
    private int comidas = 90;
    private String codigoConvite = "a51@asd";

    private void beberCafe(){
        bebidas --;
        System.out.println("voce bebeu 1 chícara, quantidade total de bebidas da festa: " + bebidas);
    }

    private void comerSalgado(){
        comidas -= 5;
        System.out.println("voce comeu 5 salgados, quantidade total de salgados na festa : " + comidas);
    }

    public void verificacaoConvite(String convite){
        if(codigoConvite == convite){
            beberCafe();
            comerSalgado();
            beberCafe();
        }else{
            System.err.println("Erro: código do convite errado! ");
        }
    }
}
