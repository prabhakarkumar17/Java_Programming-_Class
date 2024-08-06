/**
 * Pattern Printing 
 *  1 ***** - No of lines + No of star = 6
 *  2 ****    No of star = 6 - No of lines
 *  3 ***
 *  4 **
 *  5 *
 * 
 * is this pattern sequence is uniform in nature ?
 * if yes - then check for looping condition
 * We have to perform two counting
 *  1. We have to get the no of lines
 *  2. Print no. of stars
 */

class DownwardStar{
    public static void main(String args[]){

        for(int i=5; i>=1; i--) {      //This is to count the line number{} - line change
            for(int j=1; j<=i; j++){   //This loop is to print no. of stars depending upon number of line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}