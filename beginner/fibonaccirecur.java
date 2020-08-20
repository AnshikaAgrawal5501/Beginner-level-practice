import java.io.*;
class fibonaccirecur
{
    int a, b, c, limit;

    fibonaccirecur()
    {
        a=0;
        b=0;
        c=0;
        limit=0;
    }

    void input() throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        System.out.println("enter limit");
        limit = Integer.parseInt (br.readLine());
    }

    void generate()
    {
        a=0;
        b=1;
        int sum=0;
        System.out.println(a);
        System.out.println(b);
        sum=fib(a,b);
        System.out.println(sum);
    }

    int fib(int m, int n)
    {
        c=m+n;
        if(c>limit)
            return (c-n);

        else if(c==limit)
            return c;

        else
        {
            System.out.println(c);
            return (fib(n,c));
        }
    }

    public static void main(String args[]) throws IOException
    {
        fibonaccirecur fr=new fibonaccirecur();
        fr.input();
        fr.generate();
    }
}