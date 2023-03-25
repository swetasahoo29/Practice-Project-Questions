// static used for memory management for methods, variables, blocks, nested class

//  public class Static { //static block
//   public static void main(String[] args) {
//       System.out.println("Prints from main method");
//       new StaticClass();
//   }
// }
// class StaticClass {
//   static {
//       System.out.println("Prints from static block");
//   }
//   StaticClass() {
//       System.out.println("Static class Constructor");
//   }
// }


// public class Static { //static class
//   static class NestedStaticClass {
//       static class NestedClass {
//           public static String staticVariable = "NestedClass";
//           public static void staticMethod() {
//               System.out.println("Static Method of Nested Class");
//           }
//       }
//       public static String staticVariable  = "NestedStaticClass";
//       public static void staticMethod() {
//           System.out.println("Static method of Nested Static Class");
//       }
//   }
//   public static void main(String[] args) {
//       System.out.println(NestedStaticClass.staticVariable);
//       System.out.println(NestedStaticClass.NestedClass.staticVariable);
//       NestedStaticClass.NestedClass.staticMethod();
//       NestedStaticClass.staticMethod();
//   }
// }



// public class Static { //static method
//   public static void main(String[] args) {
//       City.printPlace();      // static method
//   }
// }
// class City {
//   public static String place = "Banglore";
//   public String location;
//   City (String location) {
//       this.location = location;
//   }
//   public static void printPlace() {
//       System.out.println("Regulator of Indian banks is: " + City.place);
//       //cannot access non-static member from static method (same in case of main function)
//   }
// }



public class Static {
  public static void main(String[] args) {
      System.out.println(Student.subject);

      Student sweta = new Student("Sweta", 51, "Python");
      System.out.println("Student: " + sweta);
//prints python until we change value
      System.out.println(Student.subject);
  }
}
class Student { //static variable
  private String name;
  private Integer roll;
  public static String subject = "java";

  Student(String name, Integer roll, String scisubjectentificName) {
      this.name = name;
      this.roll = roll;
//    this.subject = subject;           // gives warning: Static member accessed by instance reference
      Student.subject = subject;
  }
  @Override
  public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", roll=" + roll + '\'' +
              ", subject=" + Student.subject +
              '}';
  }
}

