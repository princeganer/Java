/*
    Practice
*/

class Box{
    int Hi, Wi, Di, Vo;
    
    public void getVol(int h, int w, int d){
         int vol;
         Hi = h;
         Wi = w;
         Di = d;
         vol= h*w*d;
         Vo= vol;  
    }
    public int shoVol(){
        return Vo;
    }
}

public class PBoxVol{
    
    public static void main(String arg[]){
        int dekh;

        Box b = new Box();
        b.getVol(12, 10, 1);
        dekh = b.shoVol();

        System.out.println("Volume of box is "+dekh);
    }
}