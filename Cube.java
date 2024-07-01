/**
 * n^3 ----> n*n*n
 * 
 * How we can get value of n
 * 1. We can assign value of n by our own without taking any user input. ----> Static Program
 * 2. We can take user input ----> Dynamic Program (Command Line arg and Scanner class)
 * 
 * Java is a case sensitive language.
 * 
 * Prog should always be time and space efficient.
 * Array is collection similiar data items. []
 *  marks = [90, 95, 85, 97, 79]
 *           0th 1st 2nd 3rd 4th
 * 
 * Type casting - To change one data type into another
 */

class Cube{
    public static void main(String args[]){
        //Command Line Argument - The moment we will run our program with java className, 
        //command there only we will provide value of n

        // int n = 9; //4 Byte

        int n = Integer.parseInt(args[0]); // Type casting from string to int

        int cube = n*n*n;
        System.out.println("The cube of number is - "+cube);
    }
}