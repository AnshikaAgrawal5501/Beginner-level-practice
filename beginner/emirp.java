import java.io.*;
class emirp
{
    public static void main() throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter a no.");
        int n=Integer.parseInt (br.readLine());

        boolean flag1=false;

        for (int i=2; i<=n/2; i++)
        {
            if (n%i==0)
            {
                flag1=true;
                break;
            }
        }

        if(flag1==false)
        {
            boolean flag2=false;
            int rev=0, d;

            while (n!=0)
            {
                d=n%10;
                n=n/10;
                rev=rev*10+d;
            }

            for (int i=2; i<=rev/2; i++)
            {
                if (rev%i==0)
                {
                    flag2=true;
                    break;
                }
            }

            if (flag2==false)
                System.out.println ("emirp no.");
            else
                System.out.println ("not an emirp no.");
        }

        else
            System.out.println ("it is not an emirp no.");
    }
}