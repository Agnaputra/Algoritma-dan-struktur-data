package week6;
import java.util.Scanner;

public class MainLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teams: ");
        int numTeams = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        PremierLeagueService leagueService = new PremierLeagueService(numTeams);

        for (int i = 0; i < numTeams; i++) {
            System.out.println("\nEnter details for Team " + (i + 1) + ":");
            System.out.print("Team name: ");
            String team = scanner.nextLine();
            System.out.print("Matches played: ");
            int played = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Goal difference: ");
            int goalDifference = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Points: ");
            int points = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            leagueService.add(team, played, goalDifference, points);
        }

        System.out.println("\nPremier League Standings before sorting:");
        leagueService.displayAll();

        // Sorting options
        System.out.println("\nSort by points:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Enter your choice (1/2): ");
        int sortChoice = scanner.nextInt();
        boolean ascending = sortChoice == 1;

        // Sorting by points
        leagueService.insertionSort(ascending);
        System.out.println("\nPremier League Standings after sorting by points:");
        leagueService.displayAll();

        scanner.close();
    }
}
