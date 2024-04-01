package week5;

import java.util.Scanner;

public class MainVotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of candidates: ");
        int numCandidates = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] candidates = new String[numCandidates];
        int[] votes = new int[numCandidates];

        System.out.println("Enter the names of the candidates:");
        for (int i = 0; i < numCandidates; i++) {
            candidates[i] = scanner.nextLine();
        }

        System.out.println("Enter the votes for each candidate:");
        for (int i = 0; i < numCandidates; i++) {
            votes[i] = scanner.nextInt();
        }

        VotingSystem votingSystem = new VotingSystem(candidates, votes);

        String winner = votingSystem.findWinners();

        if (winner.isEmpty()) {
            System.out.println("No majority winner.");
        } else {
            System.out.println("Winner(s): " + winner);
        }

        scanner.close();
    }
}
