package fr.eseo.Controlleur;

import fr.eseo.Modele.Calculatrice;

public class CalculatriceControlleur {
    private Calculatrice calculatrice;
    private int num1 ;
    private int num2 ;

    public CalculatriceControlleur() {
        this.calculatrice = new Calculatrice(num1,num2);
    }

}