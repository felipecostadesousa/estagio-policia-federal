import java.util.ArrayList;                             // importar a biblioteca para utilizar a estrutura de dados ArrayList
import java.util.Scanner;                               // importar a biblioteca para utilizar a entrada de da dados pelo teclado do usuário
public class zero {                                     // classe zero
    public static void main(String[] args) {            // classe principal do arquivo
        Scanner in = new Scanner(System.in);            // declaração da entrada de dados pelo teclado do usuário
        int N = in.nextInt();                           // entrada da quantidade de linhas/números que serão ditados pelo chefe
        ArrayList<Integer> lista = new ArrayList();     // instanciando um objeto do tipo Array List em que é possível adicionar números inteiros
        for(int i=0;i<N;i++){                           // loop para conseguir receber a quantidade de linhas dos números ditados
            int X = in.nextInt();                       // número ditado
            if(X==0){                                   // se o número ditado for igual a 0
                lista.remove(lista.size()-1);           // remove o último número ditado pelo chefe da lista
            }
            else {                                      // se o número ditado não for igual a 0
                lista.add(X);                           // adiciona o número na última posição da lista
            }
        }
        int resultado = 0;                              // declaração da variável em que depositamos o resultado da questão
        for(int i=0;i<lista.size();i++){                // percorrer a lista inteira
            resultado += lista.get(i);                  // adicionar o valor da lista na variável resultado
        }
        System.out.println(resultado);                  // printa o resultado da questão
    }
}