/*
    Assignment 1: Model Date entity having data members as dd, mm, yy. Include the functionality for showDate and use this class for creating object from main method.
*/

class Date{
    private int dd, mm, yy;
    
    public void showDate(){
    System.out.println("Date is : "+dd+" / "+mm+" / "+yy);
    }

    public void setDate(int d, int m, int y){
        dd= d;
        mm= m;
        yy= y;
    }
}


public class ModelDate{

    public static void main(String []arg){
    
        Date d1= new Date();
        d1.setDate(20, 01, 2023);
        d1.showDate();
    
        
    }
}