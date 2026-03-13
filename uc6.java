public class uc6 {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // OOPS => O O P S
        for(int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }

    // Method for letter O
    static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method for letter P
    static String[] getP() {
        return new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };
    }

    // Method for letter S
    static String[] getS() {
        return new String[]{
                " *****",
                "*     ",
                " *****",
                "      *",
                "***** "
        };
    }
}