public class Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        //Parent c2 = new Child();
        c1.parentDisplay();
        //c2.parentDisplay();
    }
}

class Parent{
    int a=10;

    void parentDisplay(){
        System.out.println("Hey this is a parent class");
    }
}

class Child extends Parent{
    int b=20;
    int sum = a+b;
    void parentDisplay(){ //Method overriding
        System.out.println("Hey this is a child class");
    }
}

