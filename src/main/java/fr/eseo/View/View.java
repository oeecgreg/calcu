package fr.eseo.View;
import fr.eseo.Controlleur.CalculatriceControlleur;
import java.util.Scanner;

public class View {
    public void viewer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculatrice :) \n \n" +
                "Quelle opération souhaitez-vous faire ? :\n \n" +
                "1- Addition (+)\n" +
                "2- Soustraction (-)\n" +
                "3- Multiplication (*)\n" +
                "4- Quitter");
        int operation = scanner.nextInt();
        System.out.print("Choisi ton premier nombre : ");
        int nombre1 = scanner.nextInt();
        System.out.println("Tu as choisis " + nombre1 + ".");
        System.out.print("Choisi ton deuxième nombre : ");
        int nombre2 = scanner.nextInt();
        System.out.println("Tu as choisis " + nombre2 + ".");
        CalculatriceControlleur calculatrice = new CalculatriceControlleur();
        System.out.println(calculatrice.choixOp(operation, nombre1, nombre2));
    }
}
