import java.io.*;
class queue
{
    int qu[];
    int front, rear, size;

    queue (int s)
    {
        size=s;
        qu=new int [size];
        front=-1;
        rear=-1;
    }

    void insert (int c)
    {
        if (rear==size-1)
            System.out.println("overflow");
        else
            qu[++rear]=c;
    }

    int remove ()
    {
        if (front==rear)
        {
            System.out.println("underflow");
            return ' ';
        }
        else
            return qu[++front];
    }

    void display ()
    {
        for (int i=front; i<=rear; i++)
        {
            System.out.print (qu[i]+" ");
        }
    }

    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter size of queue");
        int sz=Integer.parseInt (br.readLine());
        queue q=new queue (sz);
        int ch;

        do
        {
            System.out.println ("enter your choice: 1. for insert, 2. for remove");
            ch=Integer.parseInt (br.readLine());

            switch (ch)
            {
                case 1:
                {
                    System.out.println ("enter element");
                    int n=Integer.parseInt (br.readLine());
                    q.insert (n);
                    break;
                }

                case 2:
                {
                    int x=q.remove ();
                    break;
                }

                default:
                {
                    System.out.println ("invalid choice");
                }
            }
        }
        while (ch<3);

        q.display ();
    }
}