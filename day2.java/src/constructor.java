// constructor have same name as class name and doesnt have a return type

//no argument constructor
// class Main {
//     int i; 
//     // constructor with no parameter
//     private Main() {  //-private
//       i = 2;
//       System.out.println("Constructor is called");
//     }
  
//     public static void main(String[] args) {
  
//       // calling the constructor without any parameter
//       Main obj = new Main();
//       System.out.println("Value of i: " + obj.i);
//     }
//   }

// class Location {  //-public
//     String place;
  
//     // public constructor
//     public Location() {
//       place = "Banglore";
//     }
//   }
  
//   class Main {
//     public static void main(String[] args) {
  
//       // object is created in another class
//       Location l = new Location();
//       System.out.println("Location: " + l.place);
//     }
//   }

  //parameterized constructor
  class Main {

    String languages;
  
    // constructor accepting single value
    Main(String l) {
      languages = l;
      System.out.println(languages + " Programming Language");
    }
  
    public static void main(String[] args) {
  
      // call constructor by passing a single value
      Main obj1 = new Main("C");
      Main obj2 = new Main("Python");
      Main obj3 = new Main("Java");
    }
  }

//default constructor
// class Main {

//     int a;
//     boolean b;
  
//     public static void main(String[] args) {
  
//       // A default constructor is called
//       Main obj = new Main();
  
//       System.out.println("Default Value:");
//       System.out.println("a = " + obj.a);
//       System.out.println("b = " + obj.b);
//     }
//   }