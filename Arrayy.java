/**
 * Array - Collection of similiar data items
 * Class result - n=1000;
 * int std1
 * int std2
 * int std3
 * int std4
 * int std5
 * int std6....int std100 ----- Wrong approach
 * 
 * Array - multiple same data type values
 *       - Contiguos memory elements 
 * 
 * Roll no - int (2 Bytes)
 * Total no of students - 50
 * Total memory required to save roll no of all students - 100 bytes
 */

 class Arrayy{
    public static void main(String args[]){
        int rollNo[] = new int[5]; //Static array declaration

        rollNo[0] = 10;
        rollNo[1] = 20;
        rollNo[2] = 30;
        rollNo[3] = 40;
        rollNo[4] = 50;
        //rollNo[5] = 60;//Error - ArrayIndexOutOfBound
    
        for(int i=0;i<=4;i++){
            System.out.print(rollNo[i]+" ");
        }
    }
 }