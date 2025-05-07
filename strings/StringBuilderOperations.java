package strings;

import java.util.Scanner;

public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("StringBuilder Name Operations");
        System.out.println("============================");
        
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        
        StringBuilder fullName = new StringBuilder();
        
        fullName.append(firstName).append(" ").append(lastName);
        System.out.println("\n1. Full name: " + fullName);
        
        StringBuilder reversedName = new StringBuilder(fullName).reverse();
        System.out.println("\n2. Reversed name: " + reversedName);
        
        System.out.print("\nEnter your middle name: ");
        String middleName = sc.nextLine();
        
        int insertPosition = firstName.length() + 1;
        fullName = new StringBuilder(fullName.toString());
        fullName.insert(insertPosition, middleName + " ");
        System.out.println("\n3. Full name with middle name: " + fullName);
        
        System.out.print("\nEnter a new first name: ");
        String newFirstName = sc.nextLine();
        
        int endOfFirstName = firstName.length();
        fullName.replace(0, endOfFirstName, newFirstName);
        System.out.println("\n4. Name with replaced first name: " + fullName);
        
        sc.close();
    }
}
