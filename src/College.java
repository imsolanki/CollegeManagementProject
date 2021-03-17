import java.util.ArrayList;

public class College {

    String address;

    String collegeName;

    public ArrayList<Student> studentList= new ArrayList<>();
    //Student stu;


    void addStudent(Student s){

        studentList.add(s);
    }

    void printingDetail(){

        System.out.println("Name of the college: "+ collegeName);

        //System.out.println(studentList);
        for(int i =0; i<studentList.size();i++){
           Student s= studentList.get(i);  //getting student object individually
           s.printDetails();
        }
    }
    //student type method
    Student searchStudent(String name){
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).name.equals(name)){

                return studentList.get(i);
            }
        }
        throw new IllegalArgumentException();
    }


    void terminateExistingStudent(Student s1){

    }


}
/*Create another class College and it should have fields address of type String and List of Students.
In addition it should have following methods
A method to enroll a new Student
Method accept student object as parameter to be added
A method to terminate an existing student.
Method accept an student object as parameter to be removed
getNumberOfStudent() -> int
printAllStudentsDetails*/