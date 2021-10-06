public class Log
{
    
    // Change this to stop logging
    private static boolean status = false;
    
    public static void l(String str)
    {
        if(status)
        {
            System.out.println(str);
        }
    }
    
}