package fr.pompey.dev.afpa.utilitaires;


import javax.swing.*;
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
        JOptionPane.showMessageDialog(null, Arrays.toString(tabInt));
        System.out.println(Arrays.toString(tabInt));
        TrierTableau.jsp(tabInt);
        JOptionPane.showMessageDialog(null, Arrays.toString(tabInt));
        System.out.println(Arrays.toString(tabInt));
    }
}
