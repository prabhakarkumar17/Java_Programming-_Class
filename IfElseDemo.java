/*
 * Conditional Statement 
 * Condition - if
 * If (raining outside) then "take umbrella" else "Don't take it"
 * 1. Condition will always be there with if statement
 * 2. There should not be any else statement without if 
 *          but there can be if statement without else
 * 3. In every situation, either if statement will execute or else stat will execute
 */

 //Q. Take a user input integer and find out wheather no is even or odd
 import java.util.Scanner;//util ----- package(Bag)   Scanner ----- class(Item)

class IfElseDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int n;
        n = sc.nextInt();

        // Division ---- Quotient(/) and Remainder(%)  9/2 = 4 | 9%2 = 1
        // = ---> Assignment operator |   == ---> Relational operator(LHS == RHS)
        
        /*
         * Syntax ---
         * if(condition){
         *  Do something
         * } else {
         *  Do something else
         * }
         */
        if(n%2 == 0){  //n=9
            System.out.println(n+ " is divisible by 2");
        } else if(n%3 == 0){
            System.out.println(n+ " is divisible by 3");
        } else if(n%4 == 0){
            System.out.println(n+ " is divisible by 4");
        }
    }
}