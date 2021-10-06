import java.util.Scanner;
public class Main
{
    
    public static String party1 = "The Even Party";
    public static String party2 = "The Odd Party";
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many total votes shall be cast?");
        Law law1 = new Law("The Java Act",input.nextInt());
        
        law1.castVotes();
        law1.printResults();
        
    }
    
}