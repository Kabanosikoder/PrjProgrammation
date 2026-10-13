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


        // Exo1
        Clavier clavier = new Clavier();
        char myChar = clavier.lireCharLn();
        if(Character.toLowerCase(myChar) == 'a' || Character.toLowerCase(myChar) == 'e'
                || Character.toLowerCase(myChar) == 'i' || Character.toLowerCase(myChar) == 'o'
                || Character.toLowerCase(myChar) == 'u' || Character.toLowerCase(myChar) == 'y'){
            System.out.println("Voyelle");
        }else{
            System.out.println("Not voyelle");
        }

        switch(myChar){
            case 'a': case 'e': case 'i': case 'o': case 'u' : case 'y':
                System.out.println("Voyelle");
                break;
            default:
                System.out.println("Not voyelle");
        }

        int month = clavier.lireInt();
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");


        }

    }
}
