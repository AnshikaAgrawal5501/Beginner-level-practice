import java.io.*;
/**
 * Write a description of class capitalize here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class capitalize
{
    // instance variables - replace the example below with your own
    private int size;
    String sent, cap;

    /**
     * Constructor for objects of class capitalize
     */
    public capitalize()
    {
        // initialise instance variables
        size= 0;
        cap="";
        sent="";
        
    }

    public void inputsent() throws IOException
    {
        // put your code here
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader(in);
        
        System.out.println("enter a sentence in lower case");
        sent=br.readLine();
    }
    public void capchar() throws IOException
    {
        
        sent=' '+sent;
        size=sent.length();// put your code here
        for(int i=0; i<size; i++)
        {
        if(sent.charAt(i)==' '&& sent.charAt(i+1)!=' ')
        cap=cap+Character.toUpperCase(sent.charAt(i+1));
        else
        cap=cap+Character.toLowerCase(sent.charAt(i+1));
        }
        
    }
    public void display()
    {
        System.out.println("original sentence is "+sent);
        System.out.println("final sentence is "+cap);// put your code here
        
    }/**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main() throws IOException
    {
    capitalize c=new capitalize();
    c.inputsent();
    c.capchar();
    c.display();
    
    }
}
