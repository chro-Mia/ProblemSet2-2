import java.util.Random;

public class Player
{
    private double skill;
    private int numWins;
    private int numLosses;

    public Player(double skillLevel)
    {
        skill = skillLevel;
        numWins = 0;
        numLosses = 0;
    }

    public double play()
    {
        Random generator = new Random();
        return skill + generator.nextGaussian() * 0.2;
    }

    public void addWin()
    {
        numWins++;
    }

    public void addLoss()
    {
        numLosses++;
    }

    public double getSkill()
    {
        return skill;
    }

    public int getNumWins()
    {
        return numWins;
    }

    public int getNumLosses()
    {
        return numLosses;
    }
}