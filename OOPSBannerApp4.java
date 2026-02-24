/**
 * OOPS Banner App - UC4
 * Uses String array and loop to print banner.
 *
 * @author Akkuu
 * @version 4.0
 */
public class OOPSBannerApp4 {

    public static void main(String[] args) {

        // Store banner lines using String.join()
        String[] banner = {
            String.join(" ", " *** ", " *** ", "*****", " ****"),
            String.join(" ", "*   *", "*   *", "*    *", "*    *"),
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
            String.join(" ", "*   *", "*   *", "*****", " ****"),
            String.join(" ", "*   *", "*   *", "*", "     *"),
            String.join(" ", "*   *", "*   *", "*", "*    *"),
            String.join(" ", " *** ", " *** ", "*", " ****")
        };

        // Loop through array and print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}