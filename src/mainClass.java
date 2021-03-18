import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
       /* Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of student to Enroll: ");
        int input = sc.nextInt();
        sc.nextLine();

        College c =new College();
        System.out.println("Enter the name of the college: ");
        c.collegeName= sc.nextLine();
        for(int i = 1;i<=input;i++){
            System.out.println("Please enter the name of student "+i+" :");
            String name =sc.nextLine();
            System.out.println("Please enter the age of student "+i+" :");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Please enter the gpa of student "+i+" :");
            char gpa=sc.nextLine().charAt(0);
            Student s =new Student(name,age,gpa);

            c.addStudent(s);

        }

        c.printingDetail();


        System.out.println();

        try{
            System.out.println("Enter student name to search: ");
            Student student=c.searchStudent(sc.nextLine());
            student.printDetails();
        }
        catch(IllegalArgumentException e){
            System.out.println("No user found.");
        }*/

        /*System.out.println("1 for save and  2 for load!");
        int input=sc.nextInt();
        sc.nextLine();
        Student s;
        if(input==1){
            String name =sc.nextLine();
            int age =sc.nextInt();
            sc.nextLine();
            char gpa = sc.nextLine().charAt(0);
            s =new Student(name,age,gpa);
            s.saveToFile("D:\\collegeInfo.txt");
        }else{
            Student student =Student.loadFromFile("D:\\collegeInfo.txt");
            student.printDetails();

        }*/
        Scanner sc= new Scanner(System.in);

        int input=sc.nextInt();
        sc.nextLine();
        College c =College.loadFromFile();
        //College col =new College();
        if(c==null){
            c=new College();
            System.out.println("Please enter the name of the college:");
            c.collegeName=sc.nextLine();
            //sc.nextLine();
            c.saveToFile();
            System.out.println("College details saved to database.");
        }
        if(input==1){
            c.printingDetail();
        }
        else if(input==2){
            System.out.println("Enter name of the student: ");
            String name =sc.nextLine();
            System.out.println("Enter age:");
            int age =sc.nextInt();
            sc.nextLine();
            char gpa =sc.nextLine().charAt(0);
            Student s =new Student(name,age,gpa);

            c.addStudent(s);
            c.saveToFile();
            System.out.println("Students added!");


        }



    }
}



