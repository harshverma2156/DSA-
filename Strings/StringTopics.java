package Search.String;
public class StringTopics {

    public static void main(String[] args) {

        // 1. Creating String
        String name = "Harsh";
        System.out.println("Name: " + name);

        // 2. String Length
        String text = "Java Programming";
        System.out.println("Length: " + text.length());

        // 3. Character at Index
        System.out.println("Character at index 2: " + text.charAt(2));

        // 4. Convert Uppercase and Lowercase
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 5. Compare Two Strings
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));

        // 6. Check Contains
        String sentence = "I am learning Java";
        System.out.println("Contains Java: " + sentence.contains("Java"));

        // 7. Starts With and Ends With
        System.out.println("Starts with I: " + sentence.startsWith("I"));
        System.out.println("Ends with Java: " + sentence.endsWith("Java"));

        // 8. Substring
        String word = "Programming";
        System.out.println("Substring from index 3: " + word.substring(3));
        System.out.println("Substring from index 0 to 7: " + word.substring(0, 7));

        // 9. Replace String
        String message = "I like Python";
        System.out.println("After replace: " + message.replace("Python", "Java"));

        // 10. Trim Spaces
        String spaceText = "   Hello Java   ";
        System.out.println("Before trim: [" + spaceText + "]");
        System.out.println("After trim: [" + spaceText.trim() + "]");

        // 11. Split String
        String fruits = "Apple,Banana,Mango";
        String[] fruitArray = fruits.split(",");

        System.out.println("Fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 12. Find Index
        String line = "Java is easy and Java is powerful";
        System.out.println("First index of Java: " + line.indexOf("Java"));
        System.out.println("Last index of Java: " + line.lastIndexOf("Java"));

        // 13. String Concatenation
        String firstName = "Harsh";
        String lastName = "Verma";

        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // 14. Check Empty String
        String emptyText = "";

        System.out.println("Is empty: " + emptyText.isEmpty());

        // 15. Convert Number to String
        int number = 100;
        String numberString = String.valueOf(number);

        System.out.println("Number as String: " + numberString);

        // 16. Convert String to Number
        String numText = "500";
        int convertedNumber = Integer.parseInt(numText);

        System.out.println("Converted Number: " + convertedNumber);

        // 17. Reverse String
        String original = "Java";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // 18. Count Vowels in String
        String vowelText = "Education";
        int count = 0;

        for (int i = 0; i < vowelText.length(); i++) {
            char ch = Character.toLowerCase(vowelText.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowel Count: " + count);

        // 19. Check Palindrome String
        String palindromeText = "madam";
        String reverseText = "";

        for (int i = palindromeText.length() - 1; i >= 0; i--) {
            reverseText = reverseText + palindromeText.charAt(i);
        }

        if (palindromeText.equals(reverseText)) {
            System.out.println(palindromeText + " is Palindrome");
        } else {
            System.out.println(palindromeText + " is not Palindrome");
        }

        // 20. StringBuilder Example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");

        System.out.println("StringBuilder Result: " + sb);
    }
}
