package fr.pompey.dev.afpa.utilitaires;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_4 {
    public int lireMaxTabEntiers(int[] tabInt){
        int max=tabInt[0];
        for(int i=1;i<tabInt.length;i++){
            if(tabInt[i]>max){
                max=tabInt[i];
            }
        }
        return(max);
    }
    public void exercice4(Scanner sc){
        int TAILLE = 0;
        while (TAILLE<1) {
            System.out.println("Quelle taille de tableau ?");
            TAILLE = sc.nextInt();
        }
        int[] tabInt = new int[TAILLE];
        for(int i = 0; i < TAILLE; i++){
            tabInt[i] =(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(tabInt));
        System.out.println("La valeur max du tableau est "+lireMaxTabEntiers(tabInt));
    }
}
