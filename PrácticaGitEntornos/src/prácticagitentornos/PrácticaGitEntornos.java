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
        Scanner teclado=new Scanner(System.in);
        boolean elNumeroEsta = false;

        int num[]=new int[2];
        int i;
        for(i=0;i<num.length;i++){
            System.out.print("ingrese un numero: ");
            num[i]=teclado.nextInt();
        }
        for(i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        System.out.print("buscar numero: ");
        int numero;
        numero=teclado.nextInt();

        for(i=0;i<num.length;i++){
            if (numero == num[i]) {
                System.out.println("El numero está");
                elNumeroEsta = true;
            }
        }
        if(elNumeroEsta ==false) {
            System.out.println("El numero no esta");
        }
    }
}