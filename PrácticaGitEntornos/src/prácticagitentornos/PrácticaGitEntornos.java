/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticagitentornos;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Liam
 */
public class PrácticaGitEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i;
        int[] numeros = new int[10];

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca número %d: ", i + 1);
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            Arrays.sort(numeros);
            System.out.println(numeros[i]);
        }
    }
}
