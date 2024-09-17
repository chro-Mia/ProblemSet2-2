import java.util.ArrayList;

public class Tournament
{
    private ArrayList<Player> players;

    public Tournament()
    {
        players = new ArrayList<Player>();
    }

    public void addPlayer(double skillLevel)
    {
        if( skillLevel < 0 || 1 < skillLevel)
        {
            throw new IllegalArgumentException("Skill must be between 0 and 1.");
        }

        players.add(new Player(skillLevel));
    }

    // returns true if the player at index p1 beats the player at index p2
    // false if p1 loses
    public boolean play(int p1, int p2)
    {
        boolean p1Wins = (players.get(p1).play() > players.get(p2).play());

        if(p1Wins)
        {
            players.get(p1).addWin();
            players.get(p2).addLoss();
        }
        else
        {
            players.get(p1).addLoss();
            players.get(p2).addWin();
        }

        return p1Wins;
    }

    // Returns the skill of the given player
    public double getSkill(int player)
    {
        return players.get(player).getSkill();
    }

    public int getNumWins(int player)
    {
        return players.get(player).getNumWins();
    }

    public int getNumLosses(int player)
    {
        return players.get(player).getNumLosses();
    }



}