package JavaPrograms;

public class CharacterAnalyzer {
	public static void main(String[] args) {
        String inputString = "Rajesh@0820@#$*123"; // Replace with your desired string
        analyzeString(inputString);
    }

    private static void analyzeString(String str) {
        int charCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        
        StringBuilder characters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                charCount++;
                characters.append(ch);
            } else if (Character.isDigit(ch)) {
                digitCount++;
                digits.append(ch);
            } else {
                specialCharCount++;
                specialChars.append(ch);
            }
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Special character count: " + specialCharCount);
        
        System.err.println("Characters: " + characters);
        System.err.println("Digits: " + digits);
        System.err.println("Special characters: " + specialChars);
    }
}
