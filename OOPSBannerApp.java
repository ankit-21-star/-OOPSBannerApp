/**
 * OOPSBannerApp
 *
 * This program prints OOPS in a banner format
 * using String.join() method.
 *
 * @author Ankit
 * @version 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " ***** ", " ***** ", " ****** ", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*     *"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "****** ", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*",             "*"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*",       "*     *"));

        System.out.println(String.join(" ",
                " ***** ", " ***** ", "*",       " ***** "));
    }
}