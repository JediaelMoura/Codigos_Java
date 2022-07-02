/*FLUXO CONDICIONAL
*Utilização do IF, ELSE IF, ELSE
*@author: Jediael Moura
*/
public class ControleFluxo3 {
    /* Método principal da classe */
    public static void main(String[] args) {
        int idade = 32;

        if (idade <= 7) { // a idade é menor ou igual a 7?
            System.out.println("Ainda é uma criança"); // se verdadeiro, imprima
        } else if (idade > 7 && idade <= 18) {
            System.out.println("É um adolescente"); // se verdadeiro, imprima
        } else if (idade > 18 && idade <= 60) { // a idade é maior que 18 e menor ou igual a 60?
            System.out.println("É um adulto"); // se verdadeiro, imprima
        } else {
            System.out.println("Está na melhor idade"); // senao, imprima

        } // fim do método
    }// fim do método
}// fim da classe