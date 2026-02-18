public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        String[] bannerLines = {

            String.join(" ", " *** ", " *** ", " ***** ", "***** "),
            String.join(" ", "** **", "** **", "**  **", "**     "),
            String.join(" ", "** **", "** **", "**  **", "**     "),
            String.join(" ", "** **", "** **", "***** ", " ****  "),
            String.join(" ", "** **", "** **", "**     ", "    ** "),
            String.join(" ", "** **", "** **", "**     ", "**  ** "),
            String.join(" ", " *** ", " *** ", "**     ", "***** ")
        };

        // Loop to print banner lines
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}