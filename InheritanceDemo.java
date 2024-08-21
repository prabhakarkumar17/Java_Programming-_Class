/**
 * Father ----> Child (Own property + Property Father)
 * 
 * Condition of Inheritance 
 * 1. Methods and variables should be public or protected
 * 2. Private specifiers cant be inherited.
 * 
 * Func Overloading - More than one function having same name but different parameters in the same class
 * Func Overridding - If there is same name of function in inherited class as of base class.
 */

class Father{
    String fatherName = "Amitabh Bacchan";
    int fatherAge = 75;

    void getDetailsOfFather(){
        System.out.println("This is father class");
    }

    void getDetailsOfFather(String name){
        System.out.println("This is function overloading");
    }

    private
    void fatherPrivateMethod(){
        System.out.println("This is declared under private specifier");
    }
}

class Child extends Father {
    String childName = "Abhishek Bacchan ";
    int childAge = 45;

    void getDetailsOfChild(){
        System.out.println("This is Child class");
    }

    void getDetailsOfFather(){
        
        System.out.print("This is overridden function");

        super.getDetailsOfFather();
    }
}

class InheritanceDemo {
    public static void main(String args[]){
        Child c = new Child();
        
        c.getDetailsOfFather();
        //c.fatherPrivateMethod(); - Cant be accessed bcoz it is private in nature

    }
}

