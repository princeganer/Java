/*
    Assignment 2: Create a class called Box to maintain height, width and depth.
                  Also write a function which calculates volume of the box.
                  Create the object and display calculated volume.
*/

 class Box{
             
     int H,W,D,VOLUME;

     public void getVolume(int h, int w, int d){
         int volume;
         H = h;
         W = w;
         D = d; 
         volume = h * w * d;
         VOLUME = volume;
         
     }
   
     public void showVolume(){
   
         +
         System.out.println("volume for Box of height "+ H +/* " width "+*/ W +" depth "+ D + " is " + VOLUME);
    
     }

}

  public class TiffinBox{

      public static void main(String args[]){

          Box steel = new Box();
          steel.getVolume(5 , 5 , 5);
          steel.showVolume();
      }
  }  

      