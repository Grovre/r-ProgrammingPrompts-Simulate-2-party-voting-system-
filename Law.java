public class Law
{
    
    private String name;
    private String numSet = "";
    private int party1Votes = 0;
    private int party2Votes = 0;
    
    // Constructor. billName sets name of bill, numCount determines how many votes there will be in total.
    public Law(String billName, int numCount)
    {
        
        name = billName;
        
        // Creates a randomly generated number set using numCount
        for(int i = 0; i < numCount; i++)
        {
            Log.l("iter " + i + " of Law constructor");
            int temp = (int) (Math.random()*10);
            Log.l("new temp assignment " + temp);
            numSet += String.valueOf(temp);
            Log.l("numSet concat, new numSet " + numSet);
        }
        
        Log.l("Generated numSet: " + numSet);
        
    }
    
    // Returns bill name
    public String returnName()
    {
        Log.l("bill name returned: " + name);
        return name;
    }
    
    // Returns the random set of generated numbers for whatever purpose
    public int returnNumSet()
    {
        Log.l("numSet returned as int: " + Integer.decode(numSet).intValue());
        return Integer.decode(numSet).intValue();
    }
    
    // Uses the generated numSet from the constructor to determine whether each number is odd or even then tallies the votes up
    public void castVotes()
    {
        System.out.println("The parties are now voting...");
        
        for(int i = 0; i < numSet.length(); i++)
        {
            Log.l("iter " + i + " of castVotes");
            int temp = Integer.decode(numSet.substring(i,i+1)).intValue();
            if(temp % 2 == 0)
            {
                party1Votes++;
                Log.l("party1Votes++, new value: " + party1Votes);
                System.out.println("Vote cast: " + Main.party1 + " (" + temp + ")");
            } else {
                party2Votes++;
                Log.l("party2Votes++, new value: " + party2Votes);
                System.out.println("Vote cast: " + Main.party2 + " (" + temp + ")");
            }
        }
        
        System.out.println("The parties have finished voting...");
    }
    
    // Prints results or something
    public void printResults()
    {
        Log.l("printing results");
        
        System.out.println(Main.party1 + " votes: " + party1Votes);
        System.out.println(Main.party2 + " votes: " + party2Votes);

        if(party1Votes > party2Votes)
        {
            System.out.println(Main.party1 + " has won by " + (party1Votes - party2Votes) + " on " + name);
        } else if(party1Votes == party2Votes) {
            System.out.println("Both parties tied on " + name + "!");
        } else {
            System.out.println(Main.party2 + " has won by " + (party2Votes - party1Votes) + " on " + name);
        }
    }
    
}