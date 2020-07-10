import java.io.*;
class dequeue
{
    int qu[];
    int f, r, size;

    dequeue(int x)
    {
        size=x;
        qu=new int[size];
        f=-1;
        r=-1;
    }

    void addfront (int val)
    {
        if (f>0)
            qu[f--]=val;
        else
            System.out.println("overflow from front");
    }

    void addrear (int val)
    {
        if(r<size-1)
            qu[++r]=val;
        else
            System.out.println("overflow from rear");
    }

    int popfront()
    {
        if (f!=r)
            return qu[++f];
        else
            return' ';
    }

    int poprear()
    {
        if (f!=r)
            return qu[r--];
        else
            return' ';
    }

    void display ()
    {
        for (int i=f; i<r; i++)
        {
            System.out.print (qu[i]+" ");
        }
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter size of queue");
        int s=Integer.parseInt (br.readLine());

        dequeue q=new dequeue (s);

        int ch;
        do
        {
            System.out.println ("enter your choice: 1 for push from front, 2 for push from rear, 3 for delete from front, 4 for delete from rear");
            ch=Integer.parseInt (br.readLine());
            switch (ch)
            {
                case 1:
                {
                    System.out.println ("enter element");
                    int n=Integer.parseInt (br.readLine());
                    q.addfront (n);
                    break;
                }

                case 2:
                {
                    System.out.println ("enter element");
                    int n=Integer.parseInt (br.readLine());
                    q.addrear (n);
                    break;
                }

                case 3:
                {
                    int x=q.popfront ();
                    break;
                }

                case 4:
                {
                    int x=q.poprear ();
                    break;
                }

                default:
                {
                    System.out.println ("invalid choice");
                }
            }

        }
        while (ch<5);

        q.display ();
    }
}