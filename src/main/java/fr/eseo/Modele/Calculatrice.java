package fr.eseo.Modele;

public class Calculatrice {
    int chiffre1;
    int chiffre2;

    public Calculatrice(int chiffre1, int chiffre2) {
        this.chiffre1 = chiffre1;
        this.chiffre2 = chiffre2;
    }

    //Fonction qui multiplie le premier chiffre avec le deuxième.
    public int multi() {
        return chiffre1 * chiffre2;
    }

    //Fonction qui additionne le premier chiffre avec le deuxième.
    public int plus() {
        return chiffre1 + chiffre2;
    }

    //Fonction qui soustrait le premier chiffre au deuxième.
    public int minus() {
        return chiffre1 - chiffre2;
    }

    //Getter et Setter des chiffres.
    public int getChiffre1() {
        return chiffre1;
    }

    public void setChiffre1(int chiffre1) {
        this.chiffre1 = chiffre1;
    }

    public int getChiffre2() {
        return chiffre2;
    }

    public void setChiffre2(int chiffre2) {
        this.chiffre2 = chiffre2;
    }
}
