
public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        int numOpenBrackets = 0;
        int numClosedBrackets = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
<<<<<<< HEAD:unit-testing/studio/balanced-brackets/src/main/java/BalancedBrackets.java
//                numOpenBrackets++;
            } else if (ch == ']') {
                brackets--;
                if (brackets < 0) {
                    return false;
                }
//                numClosedBrackets++;
            }
        }
        return brackets == 0 /*&& numClosedBrackets == numOpenBrackets*/;
=======
                numOpenBrackets++;
            } else if (ch == ']') {
                if (brackets > 0) {
                    brackets--;
                }
                numClosedBrackets++;
            }
        }
        return brackets == 0 && numClosedBrackets == numOpenBrackets;
>>>>>>> fb0cc7abf0673a0d565ce78aa4824909eff0d046:unit-testing/studio/balanced-brackets/src/main/java/org/launchcode/BalancedBrackets.java
    }


}