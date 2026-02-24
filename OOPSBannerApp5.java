/**
 * OOPS Banner App - UC5
 * Uses inline array initialization with String.join()
 *
 * @author Akkuu
 * @version 5.0
 */
public class OOPSBannerApp5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", " *** ", " *** ", "*****", " ****"),
            String.join(" ", "*   *", "*   *", "*    *", "*    *"),
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
            String.join(" ", "*   *", "*   *", "*****", " ****"),
            String.join(" ", "*   *", "*   *", "*", "     *"),
            String.join(" ", "*   *", "*   *", "*", "*    *"),
            String.join(" ", " *** ", " *** ", "*", " ****")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}