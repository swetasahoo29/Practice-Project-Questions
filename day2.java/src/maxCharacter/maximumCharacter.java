package maxCharacter;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class maximumCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");

        try {
            String input = scanner.next();
            Pattern p = Pattern.compile("[^A-Za-z]");
            Matcher m = p.matcher(input);

            if(m.find()) throw new InvalidException("Input should only have alphabetical characters"); //find return true if pattern matches
            input = input.toLowerCase();

            int[] count = new int[26];

            char maxChar = 0;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i<input.length(); i++) {
                count[input.charAt(i)-'a']++;
            }

            for(int i = 0; i<input.length(); i++) {
                int j = count[input.charAt(i) - 'a'];
                if(max < j) {
                    max = j;
                    maxChar = input.charAt(i);
                }
            }
            System.out.println("Maximum occurring character : " + maxChar);
            System.out.println("No. of times the character is occuring: "+ max);
        }
        catch (InvalidException e) {
            System.out.print("Caught exception with message: ");
            System.out.print(e.getMessage());
        }

        scanner.close();
    }
}