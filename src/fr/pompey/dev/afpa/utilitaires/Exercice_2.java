package fr.pompey.dev.afpa.utilitaires;

import java.util.Scanner;

public class Exercice_2 {
    int i;
    int tot=1;
    public void exercice2(Scanner sc){
        int x = -1;
        int y=-1;
        while(x<0) {
            System.out.println("Entrez l'entier positif X");
            x = sc.nextInt();
        }
        while(y<0) {
            System.out.println("Entrez sa puissance entière positive Y");
            y = sc.nextInt();
        }
        i = y;
        System.out.println(Puissance(x,y));
    }

    private long Puissance(int x, int y) {
        while (i>0) {
            tot*=x;
            i--;
        }
        return tot;
    }
}
