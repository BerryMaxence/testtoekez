
/**
 * Décrivez votre classe RobotV2 ici.
 *
 * @author (votre nom)jnezfjkfzejkfze
 * @version (un numéro de version ou une date)
 */
public class Robot
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private int xPosition;
    private int yPosition;
    private final static int MIN_NAME_LENGTH=3;
    private final static int MIN_POSITION=-5;
    private final static int MAX_POSITION=5;


    public Robot()
    {
        
    }
    public void setName(String newName)
    {
        this.name= newName.trim();
        if (newName.length()>=MIN_NAME_LENGTH){
            this.name = newName;
        }
    }
    
    public void setXPosition(int newPosX)
    {
       xPosition= newPosX;
   
    }
    public void setYPosition(int newPosY)
    {
       yPosition= newPosY;
   
    }
    public int getXPosition()
    {
        return xPosition;
    }
     public int getYPosition()
    {
        return yPosition;
    }
    public String getName()
    {
        return name;
    }
}

