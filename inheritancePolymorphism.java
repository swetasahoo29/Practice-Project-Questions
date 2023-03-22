class A {

    public void add (int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void value() {
        System.out.println("Prints from base class");
    }
}


class B extends A {
    public void value () {
        System.out.println("prints from child class");
    }
}

public class inheritancePolymorphism {
    public static void main(String[] args) {
        B b = new B();

        // compile time polymorphism
        b.add(1, 2);  
        b.add(1,2,3); 

        // run time polymorphism
        b.value();
    }
}