package fr.eseo;
import fr.eseo.Controlleur.CalculatriceControlleur;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculatrice :) \n \n" +
                "Quelle opération souhaitez-vous faire ? :\n \n" +
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
        CalculatriceControlleur calculatrice = new CalculatriceControlleur();
        //System.out.println(calculatrice.choixOp(operation, nombre1, nombre2));



    }
}