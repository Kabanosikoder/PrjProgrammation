@SuppressWarnings("ALL")
public class Lab1Exos {
    public static void main(String[] args){
        // Aire et périmetre
        Clavier clavier = new Clavier();
        System.out.println("Entrée la longeur et la largeur: ");
        float longuer;
        float largeur;
        float A;
        float P;
        System.out.println("Longuer");
        longuer = clavier.lireFloatLn();
        System.out.println("Largeur");
        largeur = clavier.lireFloatLn();
        if (longuer > 0 && largeur > 0){
            A = longuer * largeur;
            P = 2*(longuer + largeur);
            System.out.println("L'aire: " + A);
            System.out.println("Le périmetre: " + P);
        }
        else {
            System.out.println("Longuer et Largeur doivent etre superieure a 0");
        }

        // Conversion secondes

        int h;
        int min;
        int sec;
        final int TIME_TO_SECONDS = 60;
        System.out.println("Heures");
        h = clavier.lireIntLn();
        System.out.println("Minutes");
        min = clavier.lireIntLn();
        if (h > 0 && min > 0 ) {
            sec = (h * TIME_TO_SECONDS + min) * TIME_TO_SECONDS;
            System.out.println("Heures et minutes en secondes: " + sec);
        }
        else{
            System.out.println("Heures et minutes doivent etre superieures a 0");
        }

        // Echanges de variables
        int num1;
        int num2;
        int temp;
        System.out.println("Number 1: ");
        num1 = clavier.lireIntLn();
        System.out.println("Number 2: ");
        num2 = clavier.lireIntLn();


        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Number 1 : " + num1);
        System.out.println("Number 2: " + num2);

        // Exo 4

        /*
         *
         * Programmeur: Kaspian Dabrowski
         * Date: 2026-9-21
         * Main.java
         *
         * Ce programme calcul le volume d'un cylindre, boom patapim
         */

        float hauteur; // la hauteur du cylindre
        float rayon; // le rayon du cylindre
        final double pi =  Math.PI; // constante pi pour la formule du volume
        double volume; // stocke la valeur du volume du cylindre

        System.out.printf("Hauteur");
        hauteur = clavier.lireFloatLn();
        System.out.printf("Rayon");
        rayon = clavier.lireFloatLn();

        if (hauteur > 0 && rayon > 0) {
            volume = pi * (rayon * rayon) * hauteur;
            System.out.printf("Volume: " + volume);
        }
        else{
            System.out.println("Hauteur ou rayon invalide");
            System.exit(1);
        }
        /*
         * La derniere instruction montre
         * la valeur du volume
         *
         */

        // Note etudiant
        System.out.println();
        System.out.println("Note etudiant");
        int note = clavier.lireIntLn();
        if (!(note < 0 || note > 100)) {
            if (note >= 90) {
                System.out.println("A");
            }
            if (note >= 80 && note <= 89) {
                System.out.println("B");
            }
            if (note >= 70 && note <= 79) {
                System.out.println("C");
            }
            if (note >= 60 && note <= 69) {
                System.out.println("D");
            } if (note <= 59){
                System.out.println("E");
            }
        }
        else{
            System.out.println("Note Invalide");
        }

    }
}