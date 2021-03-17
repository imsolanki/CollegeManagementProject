import java.io.Serializable;

public class Person implements Serializable{

    String name;
    int age;


    Person(String name, int age){
        this.name =name;
        this.age=age;
    }


    void printDetails(){
        System.out.println("The name of the person is: "+ name);
        System.out.println("The age of the person is :"+age);
    }



}
/*
OOP: Following code can  be written under the same project.
https://www.w3schools.com/java/java_oop.asp
Create a class Person having name, age and it should have method printDetails in it. And in the main
function create
any TWO object of the person class can call printDetails on each of them.



 */