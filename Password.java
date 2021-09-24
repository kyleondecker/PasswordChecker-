import java.util.Scanner;

class QuickStart {

    private static void checkPassword(String s) {
        final int length = 8;
        if (s.length() < length || s.length() > length) {
            System.out.println("Password is not 8 characters.");

        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter the password");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        checkPassword(password);

        sc.close();

    }
}