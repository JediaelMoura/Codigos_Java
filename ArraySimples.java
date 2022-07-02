
/*Utilização do Array
 * @author: Jediael Moura
 */

import java.util.Arrays;

public class ArraySimples {
    public static void main(String[] args) {
        String[] paises = { "BRASIL", "RÚSSIA", "ÍNDIA", "CHINA", "ÁFRICA DO SUL" };

        System.out.println(paises[1]);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "Brasil");
        System.out.println(posicao);

        Arrays.sort(paises, 0, paises.length); // ordena o array iniciando em zero
        System.out.println(Arrays.toString(paises)); // imprime o resultado em tela
    }
}