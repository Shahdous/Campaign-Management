/**
	@author Shahdous Zaman Khan Prohor
*/
public class FantasyCampaign extends Campaign 
{
    private String magicSystemName;

	/**	
	Constructor
	@param maxCharacters
	@param magicSystemNameIn
    */
    public FantasyCampaign(int maxCharacters, String magicSystemNameIn)
    {
        super(maxCharacters);
        this.magicSystemName = magicSystemNameIn;
    }
	
	/**
	Returns the name of Magic System
	*/
    public String getMagicSystemName()
    {
        return magicSystemName;
    }

	/**
	Modify the name of Magic System
	*/
    public void setMagicSystemName(String newMagicSystemName)
    {
        magicSystemName = newMagicSystemName;
    }
    
    // @Overriding
    /**
    Retrieve the total level for Fantasy Campaign
    */
    public int getCampaignLevel()
    {
    	int baseLevel = super.getCampaignLevel();
    	int extraLevel = super.getCharacterCount() / 3; // getting one extra level for each 3 characters, rounded down
    	return baseLevel + extraLevel;
    }
    
    // @Overriding
    /**
	Retrieves a textual list of the characters in the campaign, formatted in the way it is asked in the question
	@return The formatted string listing all characters
    */
    public String getList()
    {
        StringBuilder list = new StringBuilder(super.getList());
        
        for (int i = 0; i < getCharacterCount(); i++)
        {
            Character character = getCharacters()[i];
            
        }
		list.append("Magic System: ").append(magicSystemName).append("\n");
       	return list.toString();
    }

}