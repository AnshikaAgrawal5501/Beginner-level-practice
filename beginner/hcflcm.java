import java.io.*;
/**
 * Write a description of class hcflcm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hcflcm
{
    // instance variables - replace the example below with your own
    private int a,b;

    /**
     * Constructor for objects of class hcflcm
     */
    public hcflcm(int x,int y)
    {
        // initialise instance variables
       a=x;
       b=y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void calculate()
    {
        // put your code here
       int min= Math.min(a,b);
       int hcf=1, lcm;
       for(int i= min; i>=1;i--)
       {
        if(a%i==0 && b%i==0)
        {
        hcf=i;
        break;
        }
    }
        lcm=a*b/hcf;
          System.out.println("H.C.F"+hcf+"\n L.C.M"+lcm);
    }
     public static void main() throws IOException
     {
         InputStreamReader in= new InputStreamReader(System.in);
         BufferedReader br= new BufferedReader(in);
         System.out.println("enter two no.");
         int c=Integer.parseInt(br.readLine());
         int d=Integer.parseInt(br.readLine());
        hcflcm hl=new hcflcm(c,d );
        hl.calculate();
        }
}
