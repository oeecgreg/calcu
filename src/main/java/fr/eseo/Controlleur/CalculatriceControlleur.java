package fr.eseo.Controlleur;

import fr.eseo.Modele.Calculatrice;

public class CalculatriceControlleur {
    private Calculatrice calculatrice;

    public void choixOp(int oper, int num1, int num2) {
        calculatrice = new Calculatrice(num1, num2);
        switch(oper) {
            case 1 -> calculatrice.plus();
            case 2 -> calculatrice.minus();
            case 3 -> calculatrice.multi();
            default -> System.out.println("Erreur dans les choix");
        }
    }

}