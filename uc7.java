import java.util.ArrayList;
import java.util.List;

public class uc7 {

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store character patterns
        List<CharacterPatternMap> patternList = new ArrayList<>();

        patternList.add(new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternList.add(new CharacterPatternMap('P', new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        }));

        patternList.add(new CharacterPatternMap('S', new String[]{
                " *****",
                "*     ",
                " *****",
                "      *",
                "***** "
        }));

        String word = "OOPS";

        // Build banner
        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap cp : patternList) {

                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}