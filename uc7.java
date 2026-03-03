/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 */
public class uc7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create CharacterPatternMap array for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] P = {
            " ******",
            "*     *",
            "*     *",
            " ******",
            "*      ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ******"
        };

        String[] SPACE = {
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', SPACE)
        };
    }

    /**
     * Retrieve pattern for a given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null; // if character not found
    }

    /**
     * Print banner message
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Print OOPS banner
        printMessage("OOPS", charMaps);
    }
}