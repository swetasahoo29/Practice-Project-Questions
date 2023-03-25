public class loader {
    public static void main(String[] args) {
        try {
            Class myClass = Class.forName("Loading...");
            Object obj = myClass.getDeclaredConstructor().newInstance();
            ((loading)obj).printSomething();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class loading {
    public void printSomething() {
        System.out.println("Loading printed");
    }
}