package Types;

public class TypeTests {
    public static void main(String[] args){
        int a = 42;
        double b = a;
        System.out.println(b);

        char lettre = 'A';
        int codeAscii = lettre;
        System.out.println(codeAscii);

        int i = 5;
        double d = 2.0;
        double resultat = i / d;
        System.out.println(resultat);


        double prixOriginal = 19.99;
        int prixReduit = (int)prixOriginal;
        int compteur = 0;
        while (compteur < 5) {
            System.out.println("Compteur : " + compteur);
            compteur++;
        }
    }
}
