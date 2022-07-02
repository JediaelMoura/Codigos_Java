/*FLUXO DE REPETIÇÃO
*Utilização do DO...WHILE (FAÇA...ENQUANTO)
*@author: Jediael Moura
*/

//Importamos a classe ArrayList para poder fazer uso do vetor e armazenar elementos. "import java.util.arraylist;"

/* Método principal da classe */
public class DoWhile {

    public static void main(String[] args) { // Fluxo de repetição usando DO...WHILE
        int i = 3; // a variável i recebe o valor três (3)

        do {
            System.out.println(i); // imprima valor de i
            i++; // incremento da variável i.
        } while (i < 5); // enquanto i for menor que 5

    }// fim do método
}// fim da classe