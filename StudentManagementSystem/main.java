import java.util.Scanner;
public class main{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);

    StudentService st = new StudentService();

    do{
      System.out.println("----====STUDENT MANAGEMENT SYSTEM====----");
      System.out.println("1> Add Student");
      System.out.println("2> View Student");
      System.out.println("3> Search Student");
      System.out.println("4> Delete Student");
      System.out.println("5> EXIT");
      System.out.print("Enter choice = ");
      int choice = sc.nextInt();

      switch(choice){
          case 1: st.addStudent();
          break;
          case 2: st.viewStudents();
          break;
          case 3: st.searchStudent();
          break;
        case 4 : st.deleteStudent();
          break;
        case 5 : System.out.println("Exiting.......");
          break;
        default:
          System.out.println("Invalid choice!");
      }
    }
      while(choice!=5);
  }
}








      
