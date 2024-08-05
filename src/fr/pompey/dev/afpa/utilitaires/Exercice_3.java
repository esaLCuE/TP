package fr.pompey.dev.afpa.utilitaires;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_3 {
    public int rechercheEntier(int[] tabInt, int nat){
        int max=10;
        int min=0;
        int essai=nat+1;
        boolean fin = false;
        while ((essai!=nat)){
            essai = tabInt[(max+min)/2];
            if(essai == nat){
                return((min+max)/2);
            } else if (max==min+1) {
                return(-1);
            } else if (essai<nat) {
                min = (min+max)/2;
            } else {
                max = (min+max)/2;
            }
        }
        return(-2);
    }
    public void exercice3(Scanner sc) {
        int nat;
        int[] tabInt = new int[10];
        for (int i = 0; i < 10; i++) {
            tabInt[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(tabInt));
        Arrays.sort(tabInt);
        System.out.println(Arrays.toString(tabInt));
        System.out.println("Chercher quel nombre ?");
        nat = sc.nextInt();
        System.out.println(nat+" est en position "+rechercheEntier(tabInt, nat));
    }
}
