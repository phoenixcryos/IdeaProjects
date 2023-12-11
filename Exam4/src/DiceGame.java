import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Die {
    private int numSides;
    private int value;

    // Default constructor
    public Die() {
        numSides = 6;
        value = 1;
    }

    // Constructor with numSides argument
    public Die(int numSides) {
        this.numSides = numSides;
        value = 1;
    }

    // Getters and setters
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Number of sides: " + numSides + ", Value: " + value;
    }

    // Method to roll the die
    public void roll() {
        value = ThreadLocalRandom.current().nextInt(1, numSides + 1);
    }
}

class Player {
    private String name;
    private Die die;

    public Player(String name, Die die) {
        this.name = name;
        this.die = die;
    }

    public String getName() {
        return name;
    }

    public Die getDie() {
        return die;
    }
}

public class DiceGame {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("DiceGameOutput.txt"))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of sides for the die being used: ");
            int numSides = scanner.nextInt();

            System.out.print("Enter the number of players: ");
            int numPlayers = scanner.nextInt();

            Player[] players = new Player[numPlayers];

            for (int i = 0; i < numPlayers; i++) {
                System.out.print("Enter the name for player " + (i + 1) + ": ");
                String playerName = scanner.next();
                Die playerDie = new Die(numSides);
                players[i] = new Player(playerName, playerDie);
            }

            for (Player player : players) {
                player.getDie().roll();
                writer.println("Player " + player.getName() + " rolled a " +
                        player.getDie().getValue() + " on a " + player.getDie().getNumSides() + " sided die");
            }

            int winnerIndex = decideWinner(players);

            if (winnerIndex == -1) {
                writer.println("It's a tie!");
            } else {
                Player winner = players[winnerIndex];
                writer.println(winner.getName() + " won the game");
            }

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static int decideWinner(Player[] players) {
        int max = -1;
        int winnerIndex = -1;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getDie().getValue() > max) {
                max = players[i].getDie().getValue();
                winnerIndex = i;
            } else if (players[i].getDie().getValue() == max) {
                // It's a tie
                winnerIndex = -1;
            }
        }

        return winnerIndex;
    }
}
