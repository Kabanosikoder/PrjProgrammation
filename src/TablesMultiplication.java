public class TablesMultiplication {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 10; i++) {
            System.out.println("Table de multiplication " + i);
            for (j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + i * j + "\t");
            }
            System.out.println("\t");
        }
    }
}