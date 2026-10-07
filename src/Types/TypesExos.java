package Types;

public class TypesExos {
    public static void main(String[] args) {
        String chaine;
        String mot;
        chaine = "Goon";
        mot = "Goob";

        if (!chaine.isEmpty() && !mot.isEmpty()) {
            boolean debut = chaine.charAt(0) == mot.charAt(0);
            boolean fin = chaine.charAt(chaine.length()-1) == mot.charAt(mot.length()-1);
            System.out.println("Idem debut: " + debut);
            System.out.println("Idem fin: " + fin);
        }else {
            System.out.println("Une chaine est vide!");
        }


    }
}
