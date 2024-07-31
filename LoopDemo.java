/*
 * Loop - Repeat any particular action based upon certain condition.
 *        Execution of a code repeatedly based upon any condition.
 * 
 * types of loop - 1. For loop
 *                 2. While loop
 *                 3. Do-While loop
 * 
 * There are 3 parameters of every loop  1. Initialisation - First value
 *                                       2. Condition - Where to stop
 *                                       3. Value Updation - Value inc/dec
 */

 //WAP in java to print no from 1 to 10.
 class LoopDemo{
    public static void main(String[] args) {
        //for(initlization; condition; value updation)  
        /*
        * initlization;
        * while(condition){
        *   Logic;
        *   Value updation;
        *}
        */  
        //variable declare ----> variable define

        //     1----->2---->3----->4(value update)
       
        int i=1; //Initializaion
        for( ;i<10; ){     
                i++;   //10
                System.out.println(i);//10
                i++;//11
        }
    }
 }

/**
 * Initillization ----> Condition  --true--> Loop body --> After last line execution ----> Value update 
 *                          ^                                                                |
 *                          |                                                                |
 *                          |<---------------------------------------------------------------|
 */