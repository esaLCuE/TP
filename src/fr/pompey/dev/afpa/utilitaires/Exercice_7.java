package fr.pompey.dev.afpa.utilitaires;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exercice_7 {
    public float calculer(String oper, int nb1, int nb2){
        switch (oper) {
            case "+" -> {
                float result = nb1 + nb2;
                return (result);
            }
            case "-" -> {
                float result = nb1 - nb2;
                return (result);
            }
            case "*" -> {
                float result = nb1 * nb2;
                return (result);
            }
            default -> {
                float result = (float) nb1 / nb2;
                return (result);
            }
        }
    }
    public void exercice7(Scanner sc) {
        String oper = "a";
        int nb1;
        int nb2;
        while(!(Objects.equals(oper, "+") || Objects.equals(oper, "-") || Objects.equals(oper, "*") || Objects.equals(oper, "/"))){
            System.out.println("Ecrire le symbole de l'opération voulue");
            oper = sc.next();
        }
        System.out.println("Choisir le premier opérande");
        nb1 = sc.nextInt();
        System.out.println("Choisir le second opérande");
        nb2 = sc.nextInt();
        if (oper.equals("/")&&nb2==0) {
            System.out.println("Opération invalide.");
            System.exit(0);
        } else {
            System.out.println(calculer(oper, nb1, nb2));
        }
    }
}
