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
        {
            String rep[] = {"1", "2", "3", "4", "5", "6", "7", "7", "7", "6"};
            for (int i = 0; i < rep.length; i++) {
                for (int j = 0; j < rep.length - 1; j++) {
                    if (i != j) {
                        if (rep[i] == rep[j]) {
                            rep[i] = "";
                        }
                    }
                }
            }
            int n = rep.length;
            for (int k = 0; k <= n - 1; k++) {
                if (rep[k] != "") {
                    System.out.println(rep[k]);
                }
            }
        }
    }
}
