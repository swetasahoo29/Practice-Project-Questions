public class Enum {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Available cars: [venue, wagnor, bmw, amaze, city]");
       System.out.println("Enter the name of required scoter: ");
       String name = sc.next();
       Cars c = cars.valueOf(name.toUpperCase());
       System.out.println("Price: "+c.getPrice());
    }
 }