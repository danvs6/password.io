package src;
import java.util.Random;

public class PasswordGenerator{
    private int passwordLength;
    private String characterSet;

    // Constants for character sets
    static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String NUMBERS = "0123456789";
    static final String SYMBOLS = "!@#$%^&*()-_=+[]{}\\|;:'\",.<>/?";

    // Constructor
    public PasswordGenerator(int passwordLength, String characterSet){
        this.passwordLength=passwordLength;
        this.characterSet=characterSet;
    }

    // Methods for password generation
    public String generatePassword(){
        StringBuilder password = new StringBuilder(); // StringBuilder is a mutable string unlike class String
        Random random = new Random();

        for (int i=0; i<passwordLength;i++){
            int randomIndex = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(randomIndex); // chooses a random character based on random index in character set
            password.append(randomChar); // append random character to password 
        }

        return password.toString(); // convert password to a string
    }
}