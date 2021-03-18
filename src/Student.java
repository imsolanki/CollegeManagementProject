import java.io.*;

public class Student extends Person{

    char gpa;


    Student(String name,int age,char gpa){

        super(name, age);
        this.gpa=gpa;
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("The gpa of the person is :"+gpa);
    }

    boolean saveToFile(String fileName){
        try{
            FileOutputStream f =new FileOutputStream(fileName,false);
            ObjectOutputStream o = new ObjectOutputStream(f);
           //ByteArrayOutputStream bos = new ByteArrayOutputStream();
                o.writeObject(this);
                o.close();
            return true;
        }catch(IOException e){
            System.out.println("File not created.");
        }
        return false;
    }

    static Student loadFromFile(String filename){
        try{
            FileInputStream f = new FileInputStream(filename);
            ObjectInputStream o = new ObjectInputStream(f);
            Object obj =o.readObject();
            o.close();
            return (Student)obj;

        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

       return null;
    }

}
/*Create another class Student which inherits from Person.
And have an additional field "gpa"*/