import java.util.ArrayList;                             // importar a biblioteca para utilizar a estrutura de dados ArrayList
import java.util.Scanner;                               // importar a biblioteca para utilizar a entrada de da dados pelo teclado do usuário
public class idade {                                    // classe idade
    public static void main(String[] args) {            // classe principal do arquivo
        // Cibele nasceu antes de Camila
        // Celeste nasceu depois de Camila
        // Portanto fica dessa forma Cibela - Camila  - Celeste
        Scanner in = new Scanner(System.in);            // declaração da entrada de dados pelo teclado do usuário
        int idade1 = in.nextInt();                      // entrada da primeira idade
        int idade2 = in.nextInt();                      // entrada da segunda idade
        int idade3 = in.nextInt();                      // entrada da terceira idade
        ArrayList<Integer> lista = new ArrayList();     // instanciando um objeto do tipo Array List em que é possível adicionar números inteiros
        lista.add(idade1);                              // adiciono a primeira idade no Array List
        lista.add(idade2);                              // adiciono a segunda idade no Array List
        lista.add(idade3);                              // adiciono a terceira idade no Array List
        lista.sort(null);                               // ordeno a lista por ordem crescente dos números inteiros
        int idadeCamila = lista.get(1);                 // coloco na variável idadeCamila o valor com índice 1 que é a idade do meio, ou seja, a idade de Camila
        System.out.println(idadeCamila);                // printo a idade de camila na tela
    }   
}   