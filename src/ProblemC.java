import java.util.Scanner;
public class ProblemC
{
    public static void main(String[] args){

        Tournament tournament = new Tournament();
        Scanner input = new Scanner(System.in);
        double randomSkillLevel;
        int entrants = 0;

        //it would be stupid to run a tournament with less than 2 players, so this loop won't allow that to happen
        while(entrants < 2){
            System.out.print("How many participants do you want?: ");
            entrants = input.nextInt();
            if(entrants < 2){
                System.out.println("You'll need at least 2 participants, try again.");
            }
        }

        //this loop adds new players
        for(int i = entrants; i > 0; i--){
            randomSkillLevel = Math.random();
            tournament.addPlayer(randomSkillLevel);
        }

        /*
        this loop puts each player against each other player exactly once

        think about it like making a table, where the row number is played against the column number
        example with 5 players in the tournament:
          0 1 2 3 4
        0 X X X X X
        1 O X X X X
        2 O O X X X
        3 O O O X X
        4 O O O O X

        "O" means the game is valid and was played
        "X" means the game was not played either because of a duplicate match or because of a self-match

        this loop basically creates a triangle like in problem B, but with one less number per row
        */
        for(int i = 0; i < entrants; i++){
            for(int j = 0;j < i; j++){
                tournament.play(i, j);
            }
        }

        //prints out each participant and their number of wins
        for(int i = 0; i < entrants; i++){
            System.out.println("Player " + i + " got " + tournament.getNumWins(i) + " wins!");
        }
    }
}
