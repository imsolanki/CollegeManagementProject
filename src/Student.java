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



}
/*Create another class Student which inherits from Person.
And have an additional field "gpa"*/