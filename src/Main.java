package src;

public class Main {

    public static void main(String[] args) {
        // Create instance of password generator
        PasswordGenerator passwordGenerator = new PasswordGenerator(10, PasswordGenerator.UPPERCASE_CHARACTERS + PasswordGenerator.LOWERCASE_CHARACTERS + PasswordGenerator.SYMBOLS + PasswordGenerator.NUMBERS);
    
        // Generate a password
        String password = passwordGenerator.generatePassword();

        System.out.println("Password: " + password);
    }

    
}
