package fr.eseo.Controlleur;

import fr.eseo.Modele.Calculatrice;

public class CalculatriceControlleur {

    public int choixOp(int oper, int num1, int num2) {
        Calculatrice calculatrice = new Calculatrice(num1, num2);
        int resultat = 0;
        switch(oper) {
            case 1 -> resultat = calculatrice.plus();
            case 2 -> resultat = calculatrice.minus();
            case 3 -> resultat = calculatrice.multi();
            case 4 -> System.out.println("A plus tard.");
            default -> System.out.println("Erreur dans les choix");
        }
        return resultat;
    }
    public boolean reapeat(String choice){
        if (choice.equals("o")) {
            return true;
        }else if (choice.equals("n")) {
            return false;
        }
        return false;
    }

}