import java.util.*;
import java.math.*;

public class SoccerTeam {

	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	private int goals;
	private static int totalGoals = 0;
	private static int totalGames = 0;
	private int tournyPoints = 0;
	
	public SoccerTeam() {
		
	}
	
	public void played (SoccerTeam opponent, int myScore, int opponentScore) {
		totalGames++;
		if (myScore > opponentScore) {
			wins++;
			opponent.losses++;
		} else if (myScore < opponentScore) {
			losses++;
			opponent.wins++;
		} else if (myScore == opponentScore) {
			ties++;
			opponent.ties++;
		}
	}
	
	public static void startTournament() {
		totalGames = 0;
		totalGoals = 0;
	}
	
	public void setGoals() {
		goals = 10;
		goals = (int) (goals * Math.random());
		totalGoals = totalGoals + goals;
	}
	
	public static int getTotalGoals() {
		return totalGoals;
	}
	
	public static int getTotalGames() {
		return totalGames;
	}
	
	public int getGoals() {
		return goals;
	}
	
	public void setTournyPoints() {
		tournyPoints = tournyPoints + (wins * 3);
		tournyPoints = tournyPoints + (ties * 1);
	}

	public int getTournyPoints(){
		return tournyPoints;
	}
	
	public void reset() {
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
		this.tournyPoints = 0;
	}
}
