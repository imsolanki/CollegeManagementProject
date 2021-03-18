import java.io.*;
import java.util.ArrayList;

public class College implements Serializable{

    String address;
    final static String DATABASE_FILENAME = "college.db";
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

    /**
     * @return
     */
    boolean saveToFile(){
        try{
            FileOutputStream f =new FileOutputStream(DATABASE_FILENAME,false);
            ObjectOutputStream o = new ObjectOutputStream(f);
            //ByteArrayOutputStream bos = new ByteArrayOutputStream();
            o.writeObject(this);
            o.close();
            return true;
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("File not created.");
        }
        return false;
    }
    static College loadFromFile(){
        try{
            FileInputStream f = new FileInputStream(College.DATABASE_FILENAME);
            ObjectInputStream o = new ObjectInputStream(f);
            Object obj =o.readObject();
            o.close();
            //System.out.println(DATABASE_FILENAME);
            return (College) obj;

        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return null;
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