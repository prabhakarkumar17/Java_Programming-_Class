/**
 * Steps to write JAVA program :-
 * 1. File name should always be equal to class name.
 * 2. There always be a main()
 * 
 * To execute java program :-
 * 1. Start terminal (Shift + Ctrl + `) then run "javac Add.java" for compilation 
 *                                               "java Add" for run
 * 
 * Note :- Whenever we will make any changes in our code then we have to
 *         recompile our java program.
 */

//We will always start writing our java program in a class. And this class
//will definitely contain main().

//Data Type - We have to specify which type of data we want to save in a variable.
/**Example of Data Type - 
 * integer(int) - +ve and -ve nos -----> 2 byte / 4 Byte
 * float(decimal) - -8.9, 5.6, 8.9, etc ----> 4 Byte
 * character(char) - Single alphabet ('A', 'B', 'O')  -----> 1 Byte
 * String - Group of alphabet ("M S Dhoni")
 * Boolean - true/false
 * Long
 * Short
 * Byte
 * Double
 * 
 * int + int ---> Addition
 * String + String ---> Concatenation
 * String + int ----> Concatenation

*/
class Add{
    public static void main(String args[]){
        int x=5,y=6; //Variable - The value which may change during compilation.
        int z = x+y;

        System.out.print("The addition is - "+ z); //Concatenation
        //System.out.print("The addition is - "+ (5+6)); ---> The addition is 11
        //System.out.print("The addition is - "+ 5+6); ---> The addition is 56
        //System.out.print("5 + 6"); ----> 5 + 6
    }
}
