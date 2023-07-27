public class Pattern {

    public static void main(String[] args) {

        for (int line = 1; line <= 5; line++) {
            for (int rows = 1; rows <= line; rows++) {
                System.out.print(rows + " ");
            }
            System.out.println(" ");
        }
    }
}
