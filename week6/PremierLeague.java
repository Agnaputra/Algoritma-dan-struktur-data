package week6;

public class PremierLeague {
    String team;
    int played;
    int goalDifference;
    int points;

    public PremierLeague(String team, int played, int goalDifference, int points) {
        this.team = team;
        this.played = played;
        this.goalDifference = goalDifference;
        this.points = points;
    }

    
    public String toString() {
        return team + " - Played: " + played + ", Goal Difference: " + goalDifference + ", Points: " + points;
    }
}

