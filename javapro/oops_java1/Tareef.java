/*
    practice for set and get // vinay bro syntax war laksha de

*/


class Date1{
   
   private int DD, MM , YY;
      
   public void showDate(){
    System.out.println("Date is : "+DD+" / "+MM+" / "+YY);
    }
   public void setTarikh(int d){
 
       DD = d;
   }
   public int getTarikh(){

       return DD;
   }

   public void setMonth( int m ){
   
       MM = m;
   }
   public int getMonth(){
   
       return MM;
   }
   public void setYear( int y){
  
       YY = y;
   }
   public int getYear(){
   
       return YY;
   }
}

   public class Tareef{

       public static void main(String args[]){
       
           Date1 d1 = new Date1();
           
           d1.setTarikh(20);
           d1.setMonth(01);
           d1.setYear(1997);
           d1.showDate();
       }
    }
