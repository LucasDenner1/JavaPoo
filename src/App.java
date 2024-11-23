import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
    // Array Estático Java

    String[] nomes = new String[5];
    
    nomes[0] = "Felipe";
    nomes[1] = "Goku";
    nomes[2] = "João";
    nomes[3] = "Leona";
    nomes[4] = "Jorge";

    for(int i = 0 ; i<nomes.length ; i++){
        System.out.println(nomes[i]);
    }

    //  Array Dinâmico Java

    //  Classe <tipo> nome = new Classe <tipo>();
    //  No arrayList não é aceito tipo primitivos (int,float,double e char)
    //  É aceito "Interger", "Float" , "Double" e "Character"
    //  Também é aceito Objeto no Tipo

    ArrayList<String> arrayDinamico = new ArrayList<String>();

    // Para adicionar chama um método add();
    arrayDinamico.add("Paulo");
    arrayDinamico.add("Matias");
    arrayDinamico.add("Zé");
    arrayDinamico.add("Número 18");
    arrayDinamico.add("Tenshiham");

    // Para pegar o tamanho do array, precisa chamar um método size();
    for(int i = 0; i<arrayDinamico.size(); i++){
    // Para exibir a posição específica, chama o método get();
        System.out.println(arrayDinamico.get(i));
    }

    // Removendo uma posição do array
    System.out.println("Removendo o Zé");
    arrayDinamico.remove(2);

    for(int k = 0; k<arrayDinamico.size(); k++){
        System.out.println(arrayDinamico.get(k));
    }

    // Limpando todo o array list
    arrayDinamico.clear();  
    System.out.println(arrayDinamico.size());
    }
}
