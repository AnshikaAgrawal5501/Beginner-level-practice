import java.io.*;
class amount
{
    public static void  main (String args[])throws IOException
    {
        InputStreamReader in= new InputStreamReader (System.in);
        BufferedReader br= new BufferedReader (in);
        double cost,dis,amt;
        System.out.println ("Enter total cost of item");
        cost=Double.parseDouble(br.readLine());
        if (cost<=200)
            dis= 5*cost/100;
        else if (cost>200&&cost<=500)
            dis= 25*cost/100;
        else if (cost>500&&cost<=1000)
            dis= 35*cost/100;
        else
            dis= 50*cost/100;
        amt= cost-dis;
        System.out.println ("total bill"+amt);
    }
}
