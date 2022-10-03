/*
    Assignment 2: swap value of 2 nos
    Date : 1 Oct
*/

public class UdanChu{    // public not given, class name and filename can be different

    public static void main(String []s){
    
    int swap, a=69, b=96;

    System.out.println("A is "+a+" B is "+b);

    swap = a;
    a = b;
    b = swap;

    System.out.println("A is "+a+" B is "+b);
    }
}