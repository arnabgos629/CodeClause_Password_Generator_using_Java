import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    // Define the characters that can be used in the password
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[{]}|;:,<.>?";

    // Method to generate a random password with the specified length
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        String allChars = LOWER_CASE + UPPER_CASE + DIGITS + SPECIAL_CHARS;

        Random random = new SecureRandom();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            password.append(allChars.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12; // Change this to set the desired password length
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }
}
