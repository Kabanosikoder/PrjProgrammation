package Types;

public class CharTest {
    public static void main(String[] args) {

        char lettre = 's';
        System.out.println(lettre);
        lettre++;
        System.out.println(lettre);
        lettre--;
        lettre--;
        System.out.println(lettre);
        // lettre = lettre + 1; ajoute un int a un char (impossible)
        // lettre = lettre + (short)(1); operation sur char impossible

        String chaine = "Allo";
        System.out.println(chaine+lettre); // chaine reste le meme
        chaine = chaine + lettre;
        System.out.println(chaine); // possible car on ajout un char a une String (list of chars)
        System.out.println(chaine+1); // 1 n'est pas un nombre mais un char
        chaine = 2+chaine; // un entier peut etre concatener avec une chaine
        System.out.println(chaine);

        short sh = 109;
        System.out.println(sh);
        System.out.println(Short.MAX_VALUE);
        short un = 1;
        System.out.println(sh + un);
        int x = (short)un + (short)sh;

        char special = '\'';
        System.out.println(special);
        char test = 'a';
        test = Character.toUpperCase(test);
        System.out.println(test);

        char simple = Character.toLowerCase(test);
        System.out.println(test);
        System.out.println(simple);

        un = (short)(un + Short.MAX_VALUE);
        System.out.println(un);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        max ++;
        System.out.println(max);

        int num = un + un;
        System.out.println(num);
    }
}