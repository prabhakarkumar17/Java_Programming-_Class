/**
 * Different ways through which we can take input from user -
 * 1. Command Line Argument
 * 2. By using Scanner class - pre defined class
 * 3. By using BufferReader class
 */

import java.util.Scanner; //Scanner class's address

class ScannerDemo{
    public static void main(String args[]){
        //ScannerDemo class(user defined class) -----> Scanner class(pre defined class)
        //Scanner class ---> variable + 

        //Whenever we have to call/use any other class's methods or variable then 
        //                              we have to make object of that particular class
        
        Scanner sc = new Scanner(System.in); //Object Creation   new ---> dynamic memory allocation

        int a,b,sum;
        System.out.print("Enter the value of a");
        //scanf("%d",&a)
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        //printf("Addition of two no - %d",sum);
        System.out.println("Addition of two number - "+sum);
        
        sc.close();

    }
}

