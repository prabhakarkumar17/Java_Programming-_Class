import java.util.Scanner;

class AvgThreeNo{
    public static void main(String args[]){
        int a,b,c;
        float avg;

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter 3 numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        avg = (a+b+c)/3.0f;

        System.out.println("\n Average of 3 number - "+avg);
    }
}
