import java.io.*;
class days
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter date");
        String s=br.readLine ();

        int d=Integer.parseInt (s.substring(0,2));
        int m=Integer.parseInt (s.substring(3,5));
        int y=Integer.parseInt (s.substring(6));

        System.out.println ("enter day on 1st January");
        String day=br.readLine();

        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if (y%4==0)
            a[1]=29;
        int cnt=d;
        for (int i=1; i<m; i++)
        {
            cnt=cnt+a[i-1];
        }

        String b[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int index=0;
        for (int i=0; i<7; i++)
        {
            if (b[i].equalsIgnoreCase(day)==true)
            {
                index=i;
                break;
            }
        }
        String store=day;
        int k=index;
        for (int i=1; i<=cnt; i++)
        {
            if(k==7)
                k=0;
            store=b[k];
            k++;          
        }

        System.out.println ("day on"+d+"/"+m+"/"+y+" is "+store);
    }
}