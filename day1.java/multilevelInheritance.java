class A {
    A () {
        System.out.println("Called Constructor A");
    }
}

class B extends A{
    B () {
        System.out.println("Called Constructor B");
    }
}

class C extends B{
    C () {
        System.out.println("Called Constructor C");
    }
}


class D extends C{
    D() {
        System.out.println("Called Constructor D");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        new D();
    }
}