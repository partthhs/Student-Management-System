import java.util.Scanner;
public class StudentService {
  Scanner sc = new Scanner(System.in);

  Student[] students = new Student[100];
  int count = 0;

  void assStudent(){
    Student s = new Student();

    System.out.print("Enter id :");
    s.id = sc.nextInt();
    sc.nextLine();
    
    System.out.print("Enter Name :");
    s.name = sc,nextLine();

    System.out.print("Enter age = ");
    s.age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Course = "+course);
    s.course = sc.nextLine();

    students[count]= s;
    count++;
    System.out.println("Student added");
  }
  void viewStudents(){
    if(count==0){
      System.out.println("No student found!");
      return;
    }
    for(int i = 0;i<count;i++)
      {
        students[i].display();
      }
  }
  void searchStudent(){
    System.out.print("Enter id =");
    int id = sc.nextInt();

    for(int i = 0;i<count;i++){
      if(students[i].id==id){
        students[i].display();
        return;
      }
    }

  System.out.println("Student not found");
  }
  void deleteStudent(){
    System.out.print("Enter ID :");
    int id = sc.nextInt();

    for(int i =0; i<count;i++){
      if(student[i]==id){
        for(int j = i;j<count -1 ; j++){
          student[j] = student[j+1];
        }
        count--;
        System.out.println("DELETED");
        return;
      }
    }
    System.out.println("Student not found");
  }
}











        
