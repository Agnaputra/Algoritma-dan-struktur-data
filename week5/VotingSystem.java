package week5;

public class VotingSystem {
    String[] candidates;
    int[] votes;

    public VotingSystem(String[] candidates, int[] votes) {
        this.candidates = candidates;
        this.votes = votes;
    }

    public String findWinners() {
        String winner = "";
        int maxVotes = 0;

        for (int i = 0; i < candidates.length; i++) {
            String candidate = candidates[i];
            int candidateVotes = countVotes(candidate);
            if (candidateVotes > maxVotes) {
                winner = candidate;
                maxVotes = candidateVotes;
            } else if (candidateVotes == maxVotes) {
                winner += ", " + candidate; // Concatenate the candidate's name
            }
        }

        return maxVotes * 2 == votes.length ? winner : "";
    }

    int countVotes(String candidate) {
        int count = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].equals(candidate)) {
                count += votes[i];
            }
        }
        return count;
    }
}
