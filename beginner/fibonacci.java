import java.io.*;
class fibonacci
{
    int fib(int n)
    {
        if (n==1)
            return 0;
        else if (n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter limit of fibonacci series");
        int limit=Integer.parseInt (br.readLine());

        fibonacci f=new fibonacci ();

        System.out.println ("series is");

        for (int i=1; i<= limit; i++)
        {
            System.out.println (f.fib(i));
        }
    }
}