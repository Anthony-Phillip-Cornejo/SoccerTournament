import java.util.*;

public class TeamTester {
	public static void main(String args[]) {
		
		int tournamentNumbers;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("How Many Tournaments?");
		
		tournamentNumbers = scnr.nextInt();
		System.out.println();

		SoccerTeam team1 = new SoccerTeam();
		SoccerTeam team2 = new SoccerTeam();
		SoccerTeam team3 = new SoccerTeam();
		SoccerTeam team4 = new SoccerTeam();
		
		for(int i = 1; i <= tournamentNumbers; i++) {
		
			System.out.println("~~~~Starting New Tournament~~~~");
			System.out.println();	
			team1.reset();
			team2.reset();
			team3.reset();
			team4.reset();
			
			SoccerTeam.startTournament();
			
			team1.setGoals();
			team2.setGoals();
			team1.played(team2, team1.getGoals(), team2.getGoals());
			System.out.println("--Starting Game " + SoccerTeam.getTotalGames() + "--");
			System.out.println("Team 1 made " + team1.getGoals() + " goals this game");
			System.out.println("Team 2 made " + team2.getGoals() + " goals this game");
			if(team1.getGoals() > team2.getGoals()) {
				System.out.println("Team 1 Wins!");
			} else if(team1.getGoals() < team2.getGoals()) {
				System.out.println("Team 2 Wins!");
			} else if(team1.getGoals() == team2.getGoals()){
				System.out.println("Team 1 and Team 2 Ties!");
			}
			System.out.println();

			team1.setGoals();
			team3.setGoals();
			team1.played(team3, team1.getGoals(), team3.getGoals());
			System.out.println("--Starting Game " + SoccerTeam.getTotalGames() + "--");
			System.out.println("Team 1 made " + team1.getGoals() + " goals this game");
			System.out.println("Team 3 made " + team3.getGoals() + " goals this game");
			if(team1.getGoals() > team3.getGoals()) {
				System.out.println("Team 1 Wins!");
			} else if(team1.getGoals() < team3.getGoals()) {
				System.out.println("Team 3 Wins!");
			} else if(team1.getGoals() == team3.getGoals()){
				System.out.println("Team 1 and Team 3 Ties!");
			}
			System.out.println();

			team1.setGoals();
			team4.setGoals();
			team1.played(team4, team1.getGoals(), team4.getGoals());
			System.out.println("--Starting Game " + SoccerTeam.getTotalGames() + "--");
			System.out.println("Team 1 made " + team1.getGoals() + " goals this game");
			System.out.println("Team 4 made " + team4.getGoals() + " goals this game");
			if(team1.getGoals() > team4.getGoals()) {
				System.out.println("Team 1 Wins!");
			} else if(team1.getGoals() < team4.getGoals()) {
				System.out.println("Team 4 Wins!");
			} else if(team1.getGoals() == team4.getGoals()){
				System.out.println("Team 1 and Team 4 Ties!");
			}
			System.out.println();

			team2.setGoals();
			team3.setGoals();
			team2.played(team3, team2.getGoals(), team3.getGoals());
			System.out.println("--Starting Game " + SoccerTeam.getTotalGames() + "--");
			System.out.println("Team 2 made " + team2.getGoals() + " goals this game");
			System.out.println("Team 3 made " + team3.getGoals() + " goals this game");
			if(team2.getGoals() > team3.getGoals()) {
				System.out.println("Team 2 Wins!");
			} else if(team2.getGoals() < team3.getGoals()) {
				System.out.println("Team 3 Wins!");
			} else if(team1.getGoals() == team2.getGoals()){
				System.out.println("Team 2 and Team 3 Ties!");
			}
			System.out.println();

			team2.setGoals();
			team4.setGoals();
			team2.played(team4, team2.getGoals(), team4.getGoals());
			System.out.println("--Starting Game " + SoccerTeam.getTotalGames() + "--");
			System.out.println("Team 2 made " + team2.getGoals() + " goals this game");
			System.out.println("Team 4 made " + team4.getGoals() + " goals this game");
			if(team2.getGoals() > team4.getGoals()) {
				System.out.println("Team 2 Wins!");
			} else if(team2.getGoals() < team4.getGoals()) {
				System.out.println("Team 4 Wins!");
			} else if(team2.getGoals() == team4.getGoals()){
				System.out.println("Team 2 and Team 4 Ties!");
			}
			System.out.println();

			team3.setGoals();
			team4.setGoals();
			team3.played(team4, team3.getGoals(), team4.getGoals());
			System.out.println("--Starting Game " + SoccerTeam.getTotalGames() + "--");
			System.out.println("Team 3 made " + team3.getGoals() + " goals this game");
			System.out.println("Team 4 made " + team4.getGoals() + " goals this game");
			if(team3.getGoals() > team4.getGoals()) {
				System.out.println("Team 3 Wins!");
			} else if(team3.getGoals() < team4.getGoals()) {
				System.out.println("Team 4 Wins!");
			} else if(team3.getGoals() == team4.getGoals()){
				System.out.println("Team 3 and Team 4 Ties!");
			}
			System.out.println();
		
			team1.setTournyPoints();
			team2.setTournyPoints();
			team3.setTournyPoints();
			team4.setTournyPoints();

			
			
			System.out.println("There was " + SoccerTeam.getTotalGoals() + " total goals scored this tournament.");
			System.out.println("There was " + SoccerTeam.getTotalGames() + " total games scored this tournament.");
			System.out.println("");
		}
	}
	
}
