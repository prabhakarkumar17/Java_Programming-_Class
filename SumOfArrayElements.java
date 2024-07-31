/**
 * Collection of data items - Contiguos memory allocation
 * WAP in java to take input in array variable and find sum of its elements
 * 
 * Static array ---> size fixed
 * Dynamic array ----> size may vary 
 * 
 * Points to ponder while using loop
 * 1. Is there any initialization ?
 * 2. Is there any loop termination condition ?
 * 3. Is there any fixed pattern of value updation ?
 */

import java.util.Scanner; //util - package name     Scanner - class name

class SumOfArrayElements{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt(); //Compile time declaration
        int arr[] = new int[size]; //Static array declaration    run time 

        System.out.println("Enter values into array");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        //Sum of array elements
        int sum=0;
        for(int i=0;i<size;i++){
            sum = sum + arr[i];
            /**
             * i = 0  sum = 0  sum = 0+9 = 9
             * i = 1  sum = 9  sum = 9+8 = 17
             * i = 2  sum = 17 sum = 17+7 = 24
             * i = 3  sum = 24 sum = 24+6 = 30
             * i = 4  sum = 30 sum = 30+3 = 33
             * i = 5  sum = 33 sum = 33+5 = 38
             * i = 6  condition fail
             */
        }
        System.out.print("Sum of array elements = "+sum);

    }
}