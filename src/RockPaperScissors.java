import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Do you want to play a game of Sching, Schang, Schong? (y/n)");
        char gameOn = scanner.next().charAt(0);

        int computerWin = 0;
        int playerWin = 0;
        int tieGame = 0;
        boolean running = true;
        while (running) {
            if (gameOn == 'y' || gameOn == 'Y') { // y game
                // Player's choice
                System.out.println("Pick rock, paper or scissors. (r/p/s)");
                char playersChoice = scanner.next().charAt(0);

                // Computer's choice, 0 is rock, 1 is paper, 2 is scissors
                int randGame = random.nextInt(0, 3);
                
                if (randGame == 0) { // Computer chose Rock
                    if (playersChoice == 'r' || playersChoice == 'R') { // Player chose Rock
                        // It's a tie
                        System.out.println("It's a tie. How can't you win against a computer?!");
                        tieGame++;
                    } else if (playersChoice == 'p' || playersChoice == 'P') { // Player chose Paper
                        // Player won
                        System.out.println("You won. Well it only is a RNG-based computer you are playing against. So nothing special. Kek");
                        playerWin++;
                    } else if (playersChoice == 's' || playersChoice == 'S') { // Player chose Scissors
                        // Computer won
                        System.out.println("You lost, holy Jesus, how did you lose against a computer. What is wrong with you? It is not even that AI surpassed human intelligence. You are a negative example of the human species!");
                        computerWin++;
                    } else {
                        System.out.println("You stupid! \n You did not even type the right thing!");
                    }
                } else if (randGame == 1) { // Computer chose Paper
                    if (playersChoice == 'r' || playersChoice == 'R') { // Player chose Rock
                        // Computer won
                        System.out.println("You lost, holy Jesus, how did you lose against a computer. What is wrong with you? It is not even that AI surpassed human intelligence. You are a negative example of the human species!");
                        computerWin++;
                    } else if (playersChoice == 'p' || playersChoice == 'P') { // Player chose Paper
                        // It's a tie
                        System.out.println("It's a tie. How can't you win against a computer?!");
                        tieGame++;
                    } else if (playersChoice == 's' || playersChoice == 'S') { // Player chose Scissors
                        // Player won
                        System.out.println("You won. Well it only is a RNG-based computer you are playing against. So nothing special. Kek");
                        playerWin++;
                    } else {
                        System.out.println("You stupid! \n You did not even type the right thing!");
                    }
                } else { // Computer chose Scissors
                    if (playersChoice == 'r' || playersChoice == 'R') { // Player chose Rock
                        // Player won
                        System.out.println("You won. Well it only is a RNG-based computer you are playing against. So nothing special. Kek");
                        playerWin++;
                    } else if (playersChoice == 'p' || playersChoice == 'P') { // Player chose Paper
                        // Computer won
                        System.out.println("You lost, holy Jesus, how did you lose against a computer. What is wrong with you? It is not even that AI surpassed human intelligence. You are a negative example of the human species!");
                        computerWin++;
                    } else if (playersChoice == 's' || playersChoice == 'S') { // Player chose Scissors
                        // It's a tie
                        System.out.println("It's a tie. How can't you win against a computer?!");
                        tieGame++;
                    } else {
                        System.out.println("You stupid! \n You did not even type the right thing!");
                    }
                }
                System.out.println("Your stats are:\n You: " + playerWin + " - Computer: " + computerWin + "\n You tied " + tieGame + " times.");
                System.out.println("Do you want to play another game? (y/n)");
                char anotherGame = scanner.next().charAt(0);
                if (!(anotherGame == 'y' || anotherGame == 'Y')) {
                    System.out.println("You failed!");
                    running = false;
                }
            } else { // n game
                System.out.println("You are so bad, you should not even play!");
                running = false;
            }
        }
        scanner.close();
    }
}