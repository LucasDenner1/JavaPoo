    // Classe
public class Celular {
    // Atributos
    String nome;
    String sistemaOperacional;
    int espacoArmazenamento;
    float tamanhoTela;

    // Métodos

    void mostrarConfig(){
        System.out.format("O meu celular é um %s, o seu sistema é %s, tem %.1f de tela e %dg de armazenamento\n",nome,sistemaOperacional,tamanhoTela,espacoArmazenamento);
    }

    void downloadFile(String arquivo, int tamanhoArquivo){
        espacoArmazenamento -= tamanhoArquivo;
        System.out.println("O arquivo '" + arquivo + "' foi baixado com sucesso!");
        System.out.println("Seu armazenamento agora e de: " + espacoArmazenamento + "g");
    }
}
