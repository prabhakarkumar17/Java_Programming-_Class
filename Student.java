import java.util.Scanner;

class Student{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        StudentForm std1 = new StudentForm(); //Object creation
        StudentForm std2 = new StudentForm();
        StudentForm std3 = new StudentForm();

        System.out.println("Enter name of first student");
        String std1Name = sc.next();

        System.out.println("Enter roll no of first student");
        int std1Roll = sc.nextInt();

        System.out.println("Enter marks of first student");
        float std1Marks = sc.nextFloat();

        System.out.println("Enter class of first student");
        int std1Class = sc.nextInt();

        System.out.println("Enter college name of first student");
        String std1College = sc.next();

        
        std1.insert("MS Dhoni", 7, 77.7f, 12, 'A', "Xaviers College");
        std2.insert("Virat Kohli", 18, 60.0f, 12, 'B', "Viswaniketan");
        std3.insert("Rohit Sharma", 45, 65.0f, 12, 'C', "Mumbai Univ");

        //std1.display(std1);
        std1.display();
        System.out.println();

        //std2.display(std2);
        std2.display();
        System.out.println();

        //std3.display(std3);
        std3.display();
        System.out.println();
    }
}

class StudentForm {
    String name;
    int rollNo;
    float marks;
    int cl;
    char section;
    String collegeName;

    //Insert values into variable
    void insert(String _name, int _rollNo, float _marks, int _cl, char _section, String _collegeName){
        name = _name;
        rollNo = _rollNo;
        marks = _marks;
        cl = _cl;
        section = _section;
        collegeName = _collegeName;
    }

    void display(){
        System.out.println(name+" who was a student of "+collegeName+" scored "+marks+"% in his class "+cl+"th final.");
        System.out.println("His rollNo and section was "+rollNo+" and "+section+" respectively");
    }

    /**
     * void display(StudentForm std){
        System.out.println(std.name+" who was a student of "+std.collegeName+" scored "+std.marks+"% in his class "+std.cl+"th final.");
        System.out.println("His rollNo and section was "+std.rollNo+" and "+std.section+" respectively");
    } */

}
