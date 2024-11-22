public class Personagem {
    // Atributos
    private String nome;
    private String classe;
    private String arma;
    private int dano;
    
    // Construtor
    public Personagem(String nome, String classe, String arma, int dano){
        System.out.println("Personagem criado com sucesso!");
        this.nome = nome;
        this.classe = classe;
        this.arma = arma;
        this.dano = dano;
        mostrarPersonagem();
    }

    // Método
    private void mostrarPersonagem(){
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Arma: " + arma);
        System.out.println("Dano: " + dano);
    }

    // Métodos Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }

    
}
