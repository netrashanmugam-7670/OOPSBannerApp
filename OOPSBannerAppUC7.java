/**
 * BannerApp - UC7
 * Demonstrates use of Inner Static Class to store character patterns
 * and display "OOPS" in banner format.
 */
public class BannerApp {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character
         * @param pattern the banner pattern (7 lines)
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return pattern of the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7]; // empty pattern if not found
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        // Define patterns for characters O, P, S
        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),
            new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            }),
            new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
            })
        };

        String word = "OOPS";

        // Build banner output
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line.toString());
        }
    }
}