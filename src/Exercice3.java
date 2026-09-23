public class Exercice3 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // System.out.println(i); not valid cuz "int i" means the var is
        // only accessible in the for loop

        int j;
        for (j = 0; j <= 10; j++) {
            System.out.println(j);
        }
        System.out.println("FIN " + j);
        // this works cuz j is defined outside the for

        System.out.println("For: ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        int i = 1;
        System.out.println("While:");
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.println("Do while");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while (k <= 10);


    }
}
