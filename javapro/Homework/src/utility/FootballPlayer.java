package utility;

public class FootballPlayer extends Player{
	private int goals;
	private int assists;
	
	
	public FootballPlayer() {
		super();
	}


	public FootballPlayer(int goals, int assists) {
		super();
		this.goals = goals;
		this.assists = assists;
	}


	@Override
	public String toString() {
		return super.toString()+"FootballPlayer [goals=" + goals + ", assists=" + assists;
				 
	}
	
	
	
	
	

}
