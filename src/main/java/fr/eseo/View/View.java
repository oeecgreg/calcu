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
                    "3- Multiplication (*)\n" +
                    "4- Quitter");
            int operation = scanner.nextInt();
            System.out.println("you chose " + operation);
            System.out.println("Choisi ton premier nombre");
            int nombre1 = scanner.nextInt();
            System.out.println("you chose " + nombre1);
            System.out.println("Choisi ton deuxieme nombre");
            int nombre2 = scanner.nextInt();
            System.out.println("you chose " + nombre2);

            System.out.println(calculatrice.choixOp(operation, nombre1, nombre2)+"\n \n" +
                    "veut tu repeter?\n" +
                    "Oui (o) ou Non (n)");
            reapeat = scanner.next();

        }
    }
}