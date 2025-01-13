package fr.eseo.View;
import fr.eseo.Controlleur.CalculatriceControlleur;
import java.util.Scanner;

public class View {
    public void viewer() {
        System.out.println("Welcome to calculatrice :) \n \n");
        CalculatriceControlleur calculatrice = new CalculatriceControlleur();
        Scanner scanner = new Scanner(System.in);
        String reapeat = "o";
        while (calculatrice.reapeat(reapeat)){
            System.out.println("Quelle opération souhaitez-vous faire ? :\n \n" +
                    "1- Addition (+)\n" +
                    "2- Soustraction (-)\n" +
                    "3- Multiplication (*)\n");
             int operation = scanner.nextInt();
            System.out.print("Choisi ton premier nombre : ");
            int nombre1 = scanner.nextInt();
            System.out.println("Tu as choisis " + nombre1 + ".");
            System.out.print("Choisi ton deuxième nombre : ");
            int nombre2 = scanner.nextInt();
            System.out.println("Tu as choisis " + nombre2 + ".\n");

            System.out.println("Le résultat est " + calculatrice.choixOp(operation, nombre1, nombre2)+".\n \n" +
                    "Voulez-vous faire une autre opération?\n" +
                    "Oui (o) ou Non (n)");
            reapeat = scanner.next();
        }
    }
}