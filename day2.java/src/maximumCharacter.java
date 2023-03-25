
public class maximumCharacter {

    public char getMaxOccurringChar(String str)
    {
        //Array with length = 256
        int count[] = new int[256];
 
        // Construct character count array from the input
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        int max = -1; // Initialize max count
        char result = ' '; // Initialize result
 
        // Traversing through the string and maintain the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
 
        return result;
    }

    public static void main(String[] args) {
        //Total 256 possible characters in a string
        // for(int i=0; i<255; i++) {
        //     System.out.println((char)i + " " + i);
        // } 
        String str = "sample string";
        maximumCharacter ms = new maximumCharacter();
        System.out.println("Max occurring character is "
                           + ms.getMaxOccurringChar(str));
    }

}