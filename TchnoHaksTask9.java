import java.util.Random;
import java.util.Scanner;

class PasswordGenerator {
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_-+=<>?";

    public static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase, boolean includeNumbers, boolean includeSpecialChars) {
        StringBuilder password = new StringBuilder();
        String chars = "";

        if (includeLowercase) {
            chars += LOWERCASE_CHARS;
        }
        if (includeUppercase) {
            chars += UPPERCASE_CHARS;
        }
        if (includeNumbers) {
            chars += NUMBERS;
        }
        if (includeSpecialChars) {
            chars += SPECIAL_CHARS;
        }

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        return password.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Include lowercase characters? (y/n): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include uppercase characters? (y/n): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("y");

        String password = PasswordGenerator.generatePassword(length, includeLowercase, includeUppercase, includeNumbers, includeSpecialChars);
        System.out.println("Generated password: " + password);
    }
}