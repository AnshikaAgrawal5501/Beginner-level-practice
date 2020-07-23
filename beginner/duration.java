import java.io.*;
class duration
{
    int h, m, s;

    duration ()
    {
        h=0;
        m=0;
        s=0;
    }

    void readtime ()  throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter time as hrs-min-sec");
        h=Integer.parseInt (br.readLine());
        m=Integer.parseInt (br.readLine());
        s=Integer.parseInt (br.readLine());
    }

    duration add (duration a, duration b)
    {
        duration c=new duration ();

        c.s=a.s+b.s;
        c.m=a.m+b.m+c.s/60;
        c.h=a.h+b.h+c.m/60;
        c.s=c.s%60;
        c.m=c.m%60;

        return c;
    }

    void display ()
    {
        System.out.println ("added duration is  "+h+":"+m+":"+s);
    }

    public static void main ()throws IOException
    {
        duration d1=new duration ();
        duration d2=new duration ();
        duration d3=new duration ();

        d1.readtime ();
        d2.readtime ();
        d3=d3.add (d1, d2);
        d3.display ();
    }
}