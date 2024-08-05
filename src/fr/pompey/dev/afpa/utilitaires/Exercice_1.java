package fr.pompey.dev.afpa.utilitaires;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercice_1 {

    public void exercice1(Scanner sc) {
        //code
        System.out.println("Entrez a entier");
        int a = sc.nextInt();
        System.out.println("Entrez b entier");
        int b = sc.nextInt();
        System.out.println("Entrez c entier");
        int c = sc.nextInt();
        float x1;
        float x2;
        float disc = (b*b - 4*a*c);
        if (disc < 0) {
            System.out.println("Il n'y a pas de solutions réelle");
        } else if (disc == 0) {
            x1 = -b/(2*a) ;
            System.out.println("Il y a une seule solution : "+x1);
        } else {
            x1 = (float) (-b-sqrt(disc))/(2*a) ;
            x2 = (float) (-b+sqrt(disc))/(2*a) ;
            System.out.println("Il y a deux solutions réelles : "+x1+" et "+x2);
        }

    }
}
