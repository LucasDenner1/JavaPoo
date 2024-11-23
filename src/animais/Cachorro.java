package animais;

// extends significa que essa é uma subclasse, que vai herdar comportamentos da Super Classe ou classe mãe/pai
public class Cachorro extends Animal implements Caracteristicas {
    private String corPelo;

    // Tenho que declarar o construtor 
    public Cachorro(String nome, String corPelo){
        // Tenho que colocar o "super" para passar o valor para dentro da classe mãe
        // O super tem que ser o primeiro atributo a ser colocado.
        super(nome);
        this.corPelo = corPelo;
    }

    // Plus eu brincando de interface + herança
    public void caracteristicas() {
        System.out.printf("%s tem o Pelo %s\n",getNome(),getCorPelo());
        
    }

    public void latir(){
        System.out.printf("%s latiu!\n",getNome());
    }

    public void lamber(){
        System.out.printf("%s lambeu!\n",getNome());
    }


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
