import java.util.Scanner;
public class ProblemC
{
    public static void main(String[] args){

        Tournament tournament = new Tournament();
        Scanner input = new Scanner(System.in);
        double randomSkillLevel = 0;
        int entrants = 0;

        while(entrants < 2){
            System.out.print("How many participants do you want?: ");
            entrants = input.nextInt();
            if(entrants < 2){
                System.out.println("You'll need at least 2 participants, try again.");
            }
        }

        for(int i = entrants; i > 0; i--){
            //cannot be zero
            while(randomSkillLevel == 0){
                randomSkillLevel = Math.random();
            }
            tournament.addPlayer(randomSkillLevel);
        }

        for(int i = 0; i <= entrants - 1; i++){
            for(int j = 0;j <= i; j++){
                if(i == j){
                    break;
                }
                tournament.play(i, j);
            }
        }

        for(int i = 0; i <= entrants -1; i++){
            System.out.println("Player " + i + " got " + (tournament.getNumWins(i) + " wins!"));
        }
    }
}
