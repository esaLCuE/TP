package fr.pompey.dev.afpa.utilitaires;


import java.util.Arrays;
import java.util.Scanner;

public class Exercice_6 {
    public void exercice6(Scanner sc){
        System.out.println("Créer un tableau de quelle dimension ?");
        int N = sc.nextInt();
        int[] tabInt = new int[N];
        for (int i = 0; i < N; i++) {
            tabInt[i] = (int) (Math.random()*200-100);

        }
        System.out.println(Arrays.toString(tabInt));
        TrierTableau.jsp(tabInt);
        System.out.println(Arrays.toString(tabInt));
    }
}
