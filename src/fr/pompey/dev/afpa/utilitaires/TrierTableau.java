package fr.pompey.dev.afpa.utilitaires;

import java.util.Scanner;


public class TrierTableau {

    public static void jsp(int[] tabInt){
        boolean croissant = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Triage dans l'ordre croissant. Inverser l'ordre ?");
        if (sc.nextLine().equalsIgnoreCase("Oui")){
            croissant = false;
        }
        for (int i = 1; (i < tabInt.length); i++) {
            int j=i;
            int temp = tabInt[i];
            if (croissant) {
                while (j > 0 && temp < tabInt[j - 1]) {
                    tabInt[j] = tabInt[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && temp > tabInt[j - 1]) {
                    tabInt[j] = tabInt[j - 1];
                    j--;
                }
            }
            tabInt[j] = temp;
        }
    }
}
