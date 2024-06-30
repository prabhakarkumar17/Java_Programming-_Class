/**Area of Circle - pi*r^2
 * 
 * Class name should always start with capital(uppercase) letter.
 * if any word followed by pair of parenthesis'()' then that will be a function(method)
 * 
 * Before using any variable, we have to declare that
 * Variable declaration means type of a variable followed by name of var
 * Variable definition means we will assign value to a declared variable
 * 
 * Var/Function should always be declared and defined beforehand using the var/func
*/

class Area {
    public static void main(String args[]){
        float pi; //Variable declaration
        pi = 3.14f; //Variable definition

        float r=10.56f;
        float area = pi*r*r;
        System.out.println("Area of a circle is ---> "+area);
    }
}
