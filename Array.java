
import java.util.Scanner;

class Array {
    public static void main(String args[]){
        float marks[] = new float[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of student");
        for(int i=0; i<=4; i++){   // Insert elements
            marks[i] = sc.nextFloat();
        }

        System.out.print("\n Marks of students are - ");
        for(int i=0;i<=4;i++){  //Display elements
            System.out.print(" "+marks[i]);
        }
    }
}