public class StarPattern {
    private static void printRow(int spaces, int stars) {
        for (int j = 0; j < spaces; j++) System.out.print(" ");
        for (int j = 1; j <= stars; j++) {
            System.out.print((j == 1 || j == stars) ? "*" : " ");
            if (j < stars) System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final int ROWS = 5;

        for (int i = 1; i <= ROWS; i++) {
            printRow(ROWS - i, i);
        }
        for (int i = ROWS - 1; i >= 1; i--) {
            printRow(ROWS - i, i);
        }
    }
}

