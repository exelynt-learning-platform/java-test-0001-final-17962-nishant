public class StarPattern {
    private static void printRow(int spaces, int stars) {
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= stars; j++) {
            if (j == 1 || j == stars) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (j < stars) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final int PATTERN_HEIGHT = 5;

        for (int i = 1; i <= PATTERN_HEIGHT; i++) {
            printRow(PATTERN_HEIGHT - i, i);
        }
        for (int i = PATTERN_HEIGHT - 1; i >= 1; i--) {
            printRow(PATTERN_HEIGHT - i, i);
        }
    }
}


