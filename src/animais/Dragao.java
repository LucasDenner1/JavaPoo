package animais;

public class Dragao extends Ave implements Caracteristicas{
    
    public Dragao(String nome){
        super(nome);
    }

    void cospirFogo(){
        System.out.printf("%s cospiu fogo",getNome());
    }

    public void caracteristicas() {
        System.out.printf("%s é um dragão\n",getNome());
    }
}
