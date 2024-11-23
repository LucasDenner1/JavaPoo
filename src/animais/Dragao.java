package animais;

public class Dragao extends Ave{
    
    public Dragao(String nome){
        super(nome);
    }

    void cospirFogo(){
        System.out.printf("%s cospiu fogo",getNome());
    }

    public String toString() {
        String info = String.format("%s cospe fogo",getNome());
        return info;
    }
}
