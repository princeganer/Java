package utility;

public class Player {
	private int playerid;
	private String name;
	private int matches;
	
	public Player() {
		playerid=10;
		name="patil";
		matches=100;
		
	}

	public Player(int playerid, String name, int matches) {
		this.playerid = playerid;
		this.name = name;
		this.matches = matches;
	}

	@Override
	public String toString() {
		return "Player -> playerid=" + playerid + ", name=" + name + ", matches=" + matches;
	}
	
	
	
	
	
	
	
	
	

}
