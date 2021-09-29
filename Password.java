import java.util.Scanner;

class ValidPassword {

    private static void checkPassword(String s) {
        final int length = 8;
        if (s.length() < length || s.length() > length) {
            System.out.println("Password is not 8 characters.");

        }
    }
        /**
     * Checks if the given String contains an upper case letter.
     *
     * @param s
     *            the String to check
     * @return true if s contains an upper case letter, false otherwise
     */
    private static boolean containsUpperCaseLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if the given String contains a lower case letter.
     *
     * @param s
     * @return true if s contains a lower case letter, false otherwise
     */

    private static boolean containsLowerCaseLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

      /**
     * Check if the given String contains a digit.
     *
     * @param s
     * @return true if s contains a digit, false otherwise
     */

    private static boolean containsDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Please enter the password");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        checkPassword(password);

        boolean upperLetter = containsUpperCaseLetter(password);
        if (!upperLetter) {
            System.out.println("Password doesn't contain upper letter.");
        }

        boolean lowerLetter = containsLowerCaseLetter(password);

        if (!lowerLetter) {
            System.out.println("Password doesn't contain lower letter.");
        }

        boolean digit = containsDigit(password);

        if (!digit) {
            System.out.println("Password doesn't contain a digit.");
        }

        if (upperLetter && lowerLetter || lowerLetter && digit
                || digit && upperLetter) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
        sc.close();

    }
}
