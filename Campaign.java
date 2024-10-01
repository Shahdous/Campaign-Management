/**
    @author Shahdous Zaman Khan Prohor
*/
public class Campaign 
{
    
    private Character [] characters;
    private int currentCharacterCount;

    /**	
	Constructor
	@param maxCharacters allocated
    */
    public Campaign(int maxCharacters)
    {
        this.characters = new Character[maxCharacters];
        this.currentCharacterCount = 0;
    }

    /**
	Adds character to the campaign
	@param character The character to be added
	@return true if character is successfully added, else return false
    */
    public boolean addCharacter(Character charIn)
    {
        if (currentCharacterCount < characters.length)
        {
            characters[currentCharacterCount] = charIn;
            currentCharacterCount++;
            return true;
        } else
        {
            return false;
        }
    }

    /**
	Removes character to the campaign
	@param character The character to be added
	@return true if character is successfully removed, else return false
    */
    public boolean dropCharacter(Character charIn)
    {
    	
    	boolean isTrue = false;
        for (int i = 0; i < characters.length; i++)
        {
            if (characters[i] == charIn)
            {
                for (int j = i; j < currentCharacterCount - i; j++)
                {
                characters[j] = characters[j + 1];
                }
                characters[characters.length - 1] = null;
      			currentCharacterCount--; 			
      			isTrue = true;
            }
        } 
        return isTrue;
       
    }

    /**
	Returns the number of characters present in the campaign
	@return The current number of characters
    */
    
    public Character[] getCharacters()
    {
    	return characters;
    }
    
    public int getCharacterCount()
    {
        return currentCharacterCount;
    }

    /**
	Returns the average campaign level for the current campaign
	@return The current campaign level, rounded down
    */
    public int getCampaignLevel()
    {
        if (currentCharacterCount == 0)
        {
            return 0;
        }

        int totalLevel = 0;

        for (int i = 0; i < currentCharacterCount; i++)
        {
            totalLevel += characters[i].getLevel();
        }

        int campaignLevel = totalLevel/currentCharacterCount;
        return campaignLevel;
    }

    /**
	Retrieves a textual list of the characters in the campaign, formatted in the way it is asked in the question
	@return The formatted string listing all characters
    */
    public String getList()
    {
        StringBuilder list = new StringBuilder();
        
        for (int i = 0; i < currentCharacterCount; i++)
        {
            Character character = characters[i];
            list.append(character.getId())
                .append("\t")
                .append(character.getCharacterName())
                .append("\t")
                .append(character.getLevel())
                .append("\n");
        }
        return list.toString();
    }
}