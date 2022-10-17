package demo_app;
import utility.*;

public class App {

	public static void main(String[] args) {
		Player a[]=new Player[4];
		
		a[0]= new CricketPlayer();
		a[1]= new CricketPlayer(18, "Virat Kohli", 200, 2000, 15);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
	
		Player w= new FootballPlayer(); // base c: player ref footplayer
		System.out.println(w.toString());
		
	}

}
