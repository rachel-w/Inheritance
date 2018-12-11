// ===== Code from file StudentDerivationFromPerson.java =====
public class StudentDerivationFromPerson {
   public static void main (String [] args) {
      StudentData courseStudent = new StudentData();

      courseStudent.setName("Smith");
      courseStudent.setAge(20);
      
      courseStudent.setID(9999);
      
      courseStudent.printAll();
      System.out.println(courseStudent.getID());

      return;
   }
}
// ===== end =====
/* Use the print member method and a separate println statement to output courseStudents's data. 
   Sample output from the given program:
   Name: Smith, Age: 20, ID: 9999 */