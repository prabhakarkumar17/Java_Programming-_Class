import java.util.Scanner;

class EvenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to be checked");
        int n=sc.nextInt();

        if(n%2 == 0){
            System.out.println("This is divided by 2");
        } else if(n%5 == 0) {
            System.out.println("This is divided by 3");
        } else if(n%3 == 0){
            System.out.println("This is divided by 5");
        } else {
            System.out.println("Not divisble by any");
        }
    }
}