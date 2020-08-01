import java.io.*;
/**
 * Write a description of class employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class employee
{
    // instance variables - replace the example below with your own
    private int empno;
    double basic, net;
    String empname, empdesig;

    /**
     * Constructor for objects of class employee
     */
    public employee()
    {
        // initialise instance variables
        empno=0;
     basic=0.0;
     net=0.0;
     empname="";
     empdesig="";
    }

     public void input() throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        
        System.out.println("enter employe's number");
        empno=Integer.parseInt(br.readLine());
        System.out.println("enter employe's name");
        empname=br.readLine();
        System.out.println("enter employe's designation");
        empdesig=br.readLine();
        System.out.println("enter employe's basic salary");
        basic=Double.parseDouble(br.readLine());
        // put your code here
        
    }
    
     public void calc()
    {
        // put your code here
        double salary, pf, da, hra;
        da=10*basic/100;
        hra=15*basic/100;
        salary=basic+hra+da;
        pf=8*salary/100;
        net=salary-pf;
    }
    
    
    public void display()
    {
    System.out.println("employe number - "+empno);
    System.out.println("employe name - "+empname);
    System.out.println("employe designation - "+empdesig);
    System.out.println("employ's net salary - "+net);
    
    
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main() throws IOException
    {
        // put your code here
        employee em=new employee();
        em.input();
        em.calc();
        em.display();
    }
}
