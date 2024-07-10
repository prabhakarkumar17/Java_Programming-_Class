//Scanner class - pre-defined class in JDK
import java.util.Scanner;

class TakeUserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two nos");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("add is "+(a+b));
        
    }
}
