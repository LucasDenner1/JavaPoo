package animais;

// Isso é uma superClasse ou classe mãe/pai 
public class Animal {

    String nome;
    // Ao definir um construtor na classe mãe, nas outras também vão ser necessárias terem um. assim como o parâmatro q vai ser passado.
    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.printf("%s comeu\n",getNome());
    }

    public void beber(){
        System.out.printf("%s bebeu\n",getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
