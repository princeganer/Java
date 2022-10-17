package utility;

public class CricketPlayer extends Player{
	private int runs,wickets;
	private static int jerseyno;
	
	static {
		jerseyno=100;
		
	}

	public CricketPlayer() {
		super();
		jerseyno= ++jerseyno;
	}

	public CricketPlayer(int playerid, String name, int matches,int runs, int wickets) {
		super(playerid,name,matches);
		jerseyno= ++jerseyno;
		this.runs = runs;
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return super.toString()+"CricketPlayer [runs="+ runs + "wickets=" + wickets;
	}
	
	
	
	
	
	

}
