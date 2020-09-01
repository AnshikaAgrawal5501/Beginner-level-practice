import java.io.*;
/**
 * Write a description of class moviemagic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class moviemagic
{
    // instance variables - replace the example below with your own
    private int year;
    private String title;
    private float rating;

    /**
     * Constructor for objects of class moviemagic
     */
    public moviemagic()
    {
        // initialise instance variables
        year=0;
        title="";
        rating=0.0f;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void accept() throws IOException
    {
       InputStreamReader in= new InputStreamReader (System.in);
       BufferedReader br= new BufferedReader (in);
       // put your code here
       System.out.println("enter year");
       year=Integer.parseInt(br.readLine());
       
       System.out.println("enter film title");
       title=br.readLine();
       
       System.out.println("enter rating");
       rating=Float.parseFloat(br.readLine());   
    } 
    public void display()
    {
        System.out.println("title of movie- "+title);
        
        if(rating<=2.0)
        System.out.println("flop");
         
        else if (rating>2.0&&rating<=3.4)
        System.out.println("semi hit");
        
        else if (rating>3.4&&rating<=4.5)
        System.out.println("hit");
        
        else
        System.out.println("super hit");
        
     
        // put your code here
        
    } 
 public static void main() throws IOException
 {
     moviemagic mm=new moviemagic();
     mm.accept();
     mm.display();
    
        // put your code here
        
    }
    
}
