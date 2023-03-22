
import java.util.*;
public class fahrenheightCelcius {
    public static void main(String[] args) {
        float temperatue;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter temperatue in Fahrenheit");
        temperatue = c.nextInt();
        temperatue = ((temperatue - 32)*5)/9;
        System.out.println("Temperatue in Celsius = " + temperatue);
        }
}

