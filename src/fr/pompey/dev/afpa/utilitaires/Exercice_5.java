package fr.pompey.dev.afpa.utilitaires;

import java.util.Scanner;

public class Exercice_5 {
    public void exercice5(Scanner sc){
        int ligne = 10;
        int colonne =10;
        int[][] TabMultiplication = new int[ligne][colonne];
        for (int i = 0; i < ligne; i++) {
            TabMultiplication[i][0] = i;
        }
        for (int i = 0; i < colonne; i++) {
            TabMultiplication[0][i] = i;
        }
        for (int i = 1; i < ligne; i++) {
            for (int j = 1; j < colonne; j++) {
                TabMultiplication[i][j]=i*j;
            }
        }
        boolean fini = false;
        do {
            String rep = " ";
            int x = 0, y = 0;
            while (x < 1 || x > 9) {
                System.out.println("Choisissez une première valeur comprise entre 1 et 9.");
                x = sc.nextInt();
                if (x < 1 || x > 9) {
                    System.out.println("Veuillez entrer un entier valide !");
                }
            }
            while (y < 1 || y > 9) {
                System.out.println("Choisissez une seconde valeur comprise entre 1 et 9.");
                y = sc.nextInt();
                if (y < 1 || y > 9) {
                    System.out.println("Veuillez entrer un entier valide !");
                }
            }
            System.out.println("Le résultat de "+x+" x "+y+" = "+TabMultiplication[x][y]);
            do {
                System.out.println("Souhaitez-vous encore un calcul ?");
                rep = sc.next();
                if (rep.equalsIgnoreCase("Non")) {
                    fini = true;
                } else if (!rep.equalsIgnoreCase("Oui")) {
                    System.out.println("Je n'ai pas compris votre réponse.");
                }
            } while (!rep.equalsIgnoreCase("Oui") && !rep.equalsIgnoreCase("Non"));
        } while (!fini);
    }
}
