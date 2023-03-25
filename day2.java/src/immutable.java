//if an object cant change its state once its constructed then it is known as immutability

// class is declared final
final class immutable { //its value cant be modified
    //(it cant change its reference to point to another reference)
        // private class members
        private String name;
        private int date;
      
        immutable(String name, int date) {
      
          // class members are initialized using constructor
          this.name = name;
          this.date = date;
        }
      
        // getter method returns the copy of class members
        public String getName() {
          return name;
        }
      
        public int getDate() {
          return date;
        }
      
      }
      
      class Main {
        public static void main(String[] args) {
      
          // create object of Immutable
          immutable obj = new immutable("Sweta", 2000);
      
          System.out.println("Name: " + obj.getName());
          System.out.println("Date: " + obj.getDate());
        }
      }