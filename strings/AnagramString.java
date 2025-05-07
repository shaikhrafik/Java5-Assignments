package strings;

import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        if (isAnagram(input1, input2)) {
            System.out.println( input1 +"  "+"and"+" "+ input2+" "+" is an anagram.");
            
        } else {
            System.out.println( input1 +"  "+"and"+" "+ input2+" "+" is not an anagram.");
        }
        
        sc.close();
    }
    
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }
        
        int[] count = new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for(int i : count)
        {
            if(i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
