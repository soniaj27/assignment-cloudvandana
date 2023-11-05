import java.util.*;
import java.io.*;

public class Main {
    // Function to check if a string is a pangram
    public static void isPangram(String s) {
        // Loop through all lowercase letters
        for(char i = 'a'; i <= 'z'; i++) {
            boolean isCharacterPresent = false;
            
            // Loop through each character in the input string
            for(int j = 0; j < s.length(); j = j + 1) {
                char currentCharacter = s.charAt(j);
                
                // Convert uppercase letters to lowercase
                if(currentCharacter >= 'A' && currentCharacter <= 'Z') {
                    currentCharacter = (char)(currentCharacter + 32);
                }
                
                // Check if the current character matches the current lowercase letter
                if(currentCharacter == i) {
                    isCharacterPresent = true;
                    break;
                }
            }
            
            // If the letter is not present, it's not a pangram
            if(isCharacterPresent == false) {
                System.out.print("not pangram");
                return;
            }
        }
        
        // If all lowercase letters are present, it's a pangram
        System.out.print("pangram");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);        
    }
}
