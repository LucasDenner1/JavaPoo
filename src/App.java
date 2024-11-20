public class App {
    public static void main(String[] args) throws Exception {

        // Criando objetos
        Celular celularA = new Celular();
        Celular celularB = new Celular();

        celularA.nome = "xiaomi";
        celularA.sistemaOperacional = "Android";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;

        celularB.nome = "Iphone 12";
        celularB.sistemaOperacional = "IOS";
        celularB.tamanhoTela = 6.1f;
        celularB.espacoArmazenamento = 256;

        System.out.println("O meu celular é : " + celularA.nome);
        System.out.println("O sistema operacional é: " + celularA.sistemaOperacional);
        System.out.println("O tamanho da tela é: " + celularA.tamanhoTela);
        System.out.println("Tem : " + celularA.espacoArmazenamento + "g de armazenamento");

        System.out.format("O meu celular é um %s, o seu sistema é %s, tem %.1f de tela e %dg de armazenamento\n" , celularB.nome , celularB.sistemaOperacional , celularB.tamanhoTela , celularB.espacoArmazenamento);
        
        celularA.mostrarConfig();

        celularA.downloadFile("web-google.txt", 5);
    }
}
