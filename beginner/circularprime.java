import java.io.*;
/**
 * Write a description of class circularprime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circularprime
{
    boolean flag1=false;// instance variables - replace the example below with your own
    boolean prime (double num)
    {
        flag1= false;
     for(int i=2; i<=num/2; i++)
     {
        if(num%i==0)
        {
            flag1=true;
            break;
        }

        }
        if (flag1==true)
        return true;
        else
        return false;
    }
    
    public static void main (String arg[]) throws IOException
    {
        circularprime cp=new circularprime ();
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);
        
        System.out.print ("enter a no.");
        double n=Integer.parseInt (br.readLine());
        
        boolean flag = cp.prime(n);
        
        if (flag==true)
        System.out.println ("not a prime no.");
        
        else
        {
          double temp=n, cnt=0;
          double d, x;
            while (temp!=0)
            {
              temp=temp/10;
              cnt++;
            }
            boolean flag2;
            temp=n;
            int  check=0, i=0;
            while (i!=cnt)
            {
                i++;
                x=(Math.pow(10,(cnt-1)));
             d=temp/x;
             temp=temp%cnt+d;
             flag2=cp.prime(temp);
             if (flag2==false)
             {
                 System.out.println (temp);
                }
                else
                {
                    check=1;
                break;
            }
            }
            
            if (check==0)
            System.out.println (n+" is circular prime");
            else if (check==1)
            System.out.println (n+" is not circular prime");
            
        }
    }
}