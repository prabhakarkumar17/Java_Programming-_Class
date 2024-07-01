//We have to take 3 no as a input n1,n2,n3
//args[] = [4,  8,  9]
//Camel casing - Whenever we are connecting two words the first alphabet of second word will be in uppercase

class Sum{
    public static void main(String args[]){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        int sum = n1+n2+n3;
        System.out.println("The sum of 3 number is - "+sum);
    }
}