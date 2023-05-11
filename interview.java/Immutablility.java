//program for immutability
//if an object cant change its state once its constructed then it is known as immutability
     
public class Immutablility {

    public static void main(String[] args) {
        Student s= new Student("Sweta", 20);
        System.out.println("The students name is: " + s.getName());
        System.out.println("The Students age is " + s.getAge());

    }
    
}

final class Student {//its value cant be modified
  //(it cant change its reference to point to another reference)
      // private class members
    private final String name;
    private final int age;

    public Student(String name, int age) {
          // class members are initialized using constructor
        this.name = name;
        this.age = age;
    }
        // getter method returns the copy of class members
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}