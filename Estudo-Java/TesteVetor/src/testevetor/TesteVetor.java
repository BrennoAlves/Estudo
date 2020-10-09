/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevetor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oem
 */
public class TesteVetor {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int totalDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Digite seu ano: ");
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();

        if (ano % 4 == 0) {
            totalDias[1] = 29;
        }

        for (int c = 0; c < mes.length; c++) {

            System.out.println("O mês de " + mes[c] + " tem " + totalDias[c] + "dias.");

        }

    }

}
