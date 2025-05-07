package strings;

public class StringExplore {
    public static void main(String[] args) {
        // PART 1: Creating Strings using string literals and new keyword
        System.out.println("PART 1: Creating Strings");
        System.out.println("=======================");
        
        // Using string literals (string pool)
        String str1 = "Hello World";
        
        // Using new keyword (creates object in heap memory)
        String str2 = new String("Hello World");
        
        // Using character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        
        
        byte[] byteArray = {65, 66, 67, 68}; // ASCII values for ABCD
        String str4 = new String(byteArray);
        
        System.out.println("String literal: " + str1);
        System.out.println("String with new: " + str2);
        System.out.println("String from char array: " + str3);
        System.out.println("String from byte array: " + str4);
        
       
        System.out.println("\nPART 2: Comparing Strings");
        System.out.println("=======================");
        
        String text1 = "Java";
        String text2 = "Java";
        String text3 = new String("Java");
        String text4 = new String("java");
        
       
        System.out.println("text1 == text2: " + (text1 == text2)); // true (both reference same string pool object)
        System.out.println("text1 == text3: " + (text1 == text3)); // false (different objects in memory)
        
        
        System.out.println("text1.equals(text2): " + text1.equals(text2)); // true (same content)
        System.out.println("text1.equals(text3): " + text1.equals(text3)); // true (same content)
        System.out.println("text1.equals(text4): " + text1.equals(text4)); // false (different case)
        
        
        System.out.println("text1.equalsIgnoreCase(text4): " + text1.equalsIgnoreCase(text4)); // true (ignores case)
        
       
        System.out.println("text1.compareTo(text2): " + text1.compareTo(text2)); 
        System.out.println("text1.compareTo(text4): " + text1.compareTo(text4)); 
        System.out.println("text4.compareTo(text1): " + text4.compareTo(text1)); 
        
        // Using .compareToIgnoreCase() (lexicographical comparison, case-insensitive)
        System.out.println("text1.compareToIgnoreCase(text4): " + text1.compareToIgnoreCase(text4)); // 0 (equal ignoring case)
        
        System.out.println("Part 3: String Properties and Methods");
        System.out.println("==================================");
        
        String sample = "Java Programming Language";
        
        
        System.out.println("Length: " + sample.length());
        
        
        System.out.println("Uppercase: " + sample.toUpperCase());
        System.out.println("Lowercase: " + sample.toLowerCase());
        
        
        System.out.println("Character at index 5: " + sample.charAt(5));
        System.out.println("Substring from index 5 to 16: " + sample.substring(5, 16));
        System.out.println("Substring from index 5 to end: " + sample.substring(5));
        
        System.out.println("Index of 'Programming': " + sample.indexOf("Programming"));
        System.out.println("Last index of 'a': " + sample.lastIndexOf("a"));
        System.out.println("Contains 'Language': " + sample.contains("Language"));
        System.out.println("Starts with 'Java': " + sample.startsWith("Java"));
        System.out.println("Ends with 'age': " + sample.endsWith("age"));
        
        
        System.out.println("Replace 'Java' with 'Python': " + sample.replace("Java", "Python"));
        System.out.println("Replace all 'a' with 'o': " + sample.replaceAll("a", "o"));
        System.out.println("Replace first 'a' with 'o': " + sample.replaceFirst("a", "o"));
        
        
        String spacedString = "   Hello World   ";
        System.out.println("Original spaced string: '" + spacedString + "'");
        System.out.println("After trim: '" + spacedString.trim() + "'");
        
        
        System.out.println("Join with delimiter: " + String.join("-", "Java", "is", "cool"));
        
        
        String csvData = "Apple,Orange,Banana,Grape";
        String[] fruits = csvData.split(",");
        System.out.print("Split result: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        
        String emptyStr = "";
        String nullStr = null;
        String blankStr = "   ";
        
        System.out.println("Empty string isEmpty(): " + emptyStr.isEmpty());
        System.out.println("Blank string isEmpty(): " + blankStr.isEmpty());
        
        
        
        int number = 123;
        String numStr = String.valueOf(number);
        System.out.println("Integer to String: " + numStr);
        
        double pi = 3.14159;
        String piStr = String.valueOf(pi);
        System.out.println("Double to String: " + piStr);
        
        
        String intStr = "456";
        int parsedInt = Integer.parseInt(intStr);
        System.out.println("String to int: " + parsedInt);
        
        // Character array conversion
        char[] chars = sample.toCharArray();
        System.out.print("To char array: ");
        for (int i = 0; i < 5; i++) {  
            System.out.print(chars[i] + " ");
        }
        System.out.println("...");
        
        // String immutability demo
        System.out.println("PART 4: String immutability");
        System.out.println("=========================");
        
        String immutable = "Hello";
        System.out.println("Original string: " + immutable);
        
        immutable.concat(" World"); 
        System.out.println("After concat without assignment: " + immutable); 
        
        immutable = immutable.concat(" World");
        System.out.println("After concat with assignment: " + immutable); 
        
        // String intern method
        System.out.println("\nPART 5: STRING INTERN METHOD");
        System.out.println("==========================");
        
        String s1 = new String("Hello").intern();
        String s2 = "Hello";
        
        System.out.println("s1 == s2 after interning: " + (s1 == s2)); // true
    }
}
