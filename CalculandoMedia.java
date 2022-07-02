/*Calculo de média*
@author: Jediael Moura*/

import java.util.Scanner;

public class CalculandoMedia {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        float av1, av2, media;

        System.out.println("Informe a nota da 1ª Avaliação");
        av1 = s1.nextFloat();

        System.out.println("Informe a nota da 2ª Avaliação");
        av2 = s1.nextFloat();

        media = (av1 + av2) / 2.0f;

        if (media >= 7.0f) {
            System.out.println("PARABÉNS! Você está aprovado\n");

        } else {
            System.out.println("Desta vez você foi reprovado, mas continue tentando.\n");
        }
    }
}