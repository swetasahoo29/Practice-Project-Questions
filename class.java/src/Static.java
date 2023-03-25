//used for memory management for methods, variables, blocks, nested class
class Student{  
    int rollno;//instance variable  
    String name;  
    static String college ="ITER";//static variable  
    //constructor  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){
        System.out.println(rollno+" "+name+" "+college);
    }  
 }  
 //Test class to show the values of objects  
 public class Static{  
  public static void main(String args[]){  
  Student s1 = new Student(1,"Sweta");  
  Student s2 = new Student(2,"Sahoo");  
  //we can change the college of all objects by the single line of code  
//   Student.college="SOA";  
  s1.display();  
  s2.display();  
  }  
 }  

