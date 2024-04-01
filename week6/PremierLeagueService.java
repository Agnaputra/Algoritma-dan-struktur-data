package week6;

public class PremierLeagueService {
    PremierLeague[] leagues;
    int size;

    public PremierLeagueService(int capacity) {
        leagues = new PremierLeague[capacity];
        size = 0;
    }

    public void add(String team, int played, int goalDifference, int points) {
        if (size < leagues.length) {
            leagues[size++] = new PremierLeague(team, played, goalDifference, points);
        } else {
            System.out.println("Premier League service is full.");
        }
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.println("Position " + (i + 1) + ": " + leagues[i]);
        }
    }

    public void insertionSort(boolean asc) {
        for (int i = 1; i < size; i++) {
            PremierLeague key = leagues[i];
            int j = i - 1;

            while (j >= 0 && (asc ? leagues[j].points > key.points : leagues[j].points < key.points)) {
                leagues[j + 1] = leagues[j];
                j = j - 1;
            }
            leagues[j + 1] = key;
        }
    }
}
