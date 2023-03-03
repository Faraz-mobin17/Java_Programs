package GameProject;
import java.util.Scanner;
/*
 * Main method
 */
public class LaunchGame {
    public static void main(String[] args) 
    {
        System.out.println("Game Started");    
        Umpire faraz = new Umpire();
        faraz.collectNumberFromGusser();
        faraz.collectNumberFromPlayer();
        faraz.compare();
    }
}

/*
 * this class contains method guessingNumber and variable guessNum
 * guessing Number method will take input and guess the number
 */
class Gusser 
{
    int guessNum;
    public int guessingNumber() 
    {
        System.out.println("Gusser! Kindly Guess the Number");
        Scanner input = new Scanner(System.in);
        guessNum = input.nextInt();
        return guessNum;
    }
}
/*
 * This class is of player class will take input from player
 */
class Player 
{
    int guessNum;
    public int guessingNumber(int n) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Player"+ n +" kindly Guess the Number!");
        guessNum = input.nextInt();
        return guessNum;
    }
}
/*
 * This class collects numbers from Player and 
 * Guesser and check who wins the game.
 */
class Umpire 
{
    int numberFromGusser;
    int numberFromPlayer1,numberFromPlayer2,numberFromPlayer3;

    public void collectNumberFromPlayer() 
    {
        // collection the number from players
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numberFromPlayer1 = p1.guessingNumber(1);
        numberFromPlayer2 = p2.guessingNumber(2);
        numberFromPlayer3 = p3.guessingNumber(3);
    }
    public void collectNumberFromGusser() 
    {
        // collecting number from gusser
        Gusser obj = new Gusser();
        numberFromGusser = obj.guessingNumber();
    }
    public void compare()
    {
        // comparing two number  
        if (numberFromGusser == numberFromPlayer1)
        {
            if ( numberFromGusser == numberFromPlayer2 && numberFromGusser == numberFromPlayer3)
            {
                System.out.println("All Player won the game");
            }
            else if (numberFromGusser == numberFromPlayer2)
            {
                System.out.println("Player 1 and Player 2 won the game");
            } 
            else if (numberFromGusser == numberFromPlayer3)
            {
                System.out.println("Player 1 and Player 3 won the game");
            }
            else 
            {
                System.out.println("Player 1 won the game");
            }
        } 
        else if (numberFromGusser == numberFromPlayer2)
        {
            if (numberFromGusser == numberFromPlayer3)
            {
                System.out.println("Player 2 and Player 3 won the game");
            }
            else 
            {
                System.out.println("Player 2 won the game");
            }
        } 
        else if (numberFromGusser == numberFromPlayer3)
        {
            System.out.println("Player 3 won the game");
        } 
        else 
        {
            System.out.println("Nobody won the game");
        }
    }
}
