/**
 * OOPS Banner App - UC3
 * Prints ASCII banner using String.join() for better structure.
 *
 * @author Akkuu
 * @version 3.0
 */
public class OOPSBannerApp3 {

    public static void main(String[] args) {

        // Row 1
        System.out.println(String.join(" ",
                " *** ",
                " *** ",
                "*****",
                " ****"
        ));

        // Row 2
        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*    *",
                "*    *"
        ));

        // Row 3
        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*    *",
                "*"
        ));

        // Row 4
        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*****",
                " ****"
        ));

        // Row 5
        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*",
                "     *"
        ));

        // Row 6
        System.out.println(String.join(" ",
                "*   *",
                "*   *",
                "*",
                "*    *"
        ));

        // Row 7
        System.out.println(String.join(" ",
                " *** ",
                " *** ",
                "*",
                " ****"
        ));
    }
}