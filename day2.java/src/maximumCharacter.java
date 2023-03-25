
public class maximumCharacter {

    public char getMaxOccurringChar(String s)
    {
        //Array with length 256
        int count[] = new int[256];
 
        // Construct character count array from the input
        int l = s.length();
        for (int i = 0; i < l; i++)
            count[s.charAt(i)]++;
 
        int max = -1; // Initialize maximum count
        char result = ' '; // Initialize result
 
        // Traversing through the string and maintain the count of each character
        for (int i = 0; i < l; i++) {
            if (max < count[s.charAt(i)]) {
                max = count[s.charAt(i)];
                result = s.charAt(i);
            }
        }
 
        return result;
    }

    public static void main(String[] args) {
        //Total 256 possible characters in a string
        // for(int i=0; i<255; i++) {
        //     System.out.println((char)i + " " + i);
        // } 
        String s = "sweta";
        maximumCharacter m = new maximumCharacter();
        System.out.println("Maximum occurring character : "
                           + m.getMaxOccurringChar(s));
    }

}
