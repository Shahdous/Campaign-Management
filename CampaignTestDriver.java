/**
	@author Shahdous Zaman Khan Prohor
*/
public class CampaignTestDriver {
    public static void main(String[] args) {
        // Test 1: Reporting on campaigns at different levels
        System.out.println("\nTest 1: Reporting on Campaign Levels");
        
        Campaign campaign = new Campaign(4);
        
        Character c1 = new Character("Alice", 3);
        Character c2 = new Character("Bob", 5);
        Character c3 = new Character("Sue", 3);
        
        campaign.addCharacter(c1);
        campaign.addCharacter(c2);
        campaign.addCharacter(c3);
        System.out.println("Campaign Level: " + campaign.getCampaignLevel());
        
        // Test 2: Reporting on fantasy campaigns at different levels
        System.out.println("\nTest 2: Reporting on Fantasy Campaign Levels");
        
        FantasyCampaign fantasyCampaign = new FantasyCampaign(4, "soft-rational");
        
        Character c4 = new Character("Jon Snow", 4);
        Character c5 = new Character("Ned Stark", 8);
        Character c6 = new Character("Lannister", 6);
        
		fantasyCampaign.addCharacter(c4);
		fantasyCampaign.addCharacter(c5);
		fantasyCampaign.addCharacter(c6);
		System.out.println("Fantasy Campaign Level: " + fantasyCampaign.getCampaignLevel());
	
		// Test 3: Adding and Dropping characters
		System.out.println("\nTest 3: Adding and Dropping Characters");
		
		Character c7 = new Character("Jack", 4);
		
		campaign.addCharacter(c7);
		System.out.println("Characters after adding " + c7.getCharacterName() + ": \n" + campaign.getList());
		
		campaign.dropCharacter(c7);
		System.out.println("Character count after dropping " + c7.getCharacterName() + ": \n" + campaign.getList());
		
		// Test 4: Adding too many characters
		System.out.println("\nTest 4: Adding Too Many Characters");
		
		Character c8 = new Character("Rob Stark", 5);
		Character c9 = new Character("Arya Stark", 4);
		
		boolean isAddedC8 = campaign.addCharacter(c8);
		boolean isAddedC9 = campaign.addCharacter(c9);
		
		if(isAddedC8)
		{
			System.out.println("Attempted to add " + c8.getCharacterName() + ": Succeeded");
		} 
		else
		{
			System.out.println("Attempted to add " + c8.getCharacterName() + ": Failed");		
		}
		
		if(isAddedC9)
		{
			System.out.println("Attempted to add " + c9.getCharacterName() + ": Succeeded");
		} 
		else
		{
			System.out.println("Attempted to add " + c9.getCharacterName() + ": Failed");		
		}
		
		System.out.println("Character count after attempts: " + campaign.getCharacterCount());
		
		
		// Test 5: Removing a character that doesn't exist
		
		 System.out.println("\nTest 5: Trying to Remove a Character That Doesn't Exist");
		 Character c10 = new Character("Ghost", 3);
		 boolean isRemoved = campaign.dropCharacter(c10);
		 
		 if(isRemoved)
		 {
		 	System.out.println("Attempted to remove " + c10.getCharacterName() + ": Succeeded");
		 }
		 else 
		 {
		 	System.out.println("Attempted to remove " + c10.getCharacterName() + ": Failed\n");
		 }
    }
}