/**
 * OOPSBannerApp
 *
 * Prints OOPS banner using helper methods
 * for each character pattern.
 *
 * @author Ankit
 * @version 1.0
 */

public class OOPSBannerApp {

    // Method for letter O
    public static String[] getOPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Print banner using loop
        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join(" ",
                    O[i],   // First O
                    O[i],   // Second O
                    P[i],   // P
                    S[i]    // S
                )
            );
        }
    }
}