import java.io.*;
class stack
{
    int st[];
    int top, size;

    stack(int s)
    {
        size=s;
        st=new int[size];
        top=-1;
    }

    void push (int val)
    {
        if (top==size-1)
            System.out.println("overflow");
        else
            st[++top]=val;
    }

    int pop ()
    {
        if (top==-1)
        {
            System.out.println("underflow");
            return ' ';
        }
        else    
            return st[top--];
    }

    void display ()
    {
        for (int i=0; i<=top; i++)
        {
            System.out.print (st[i]+" ");
        }
    }

    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);
        System.out.println ("enter size of stack");
        int sz=Integer.parseInt (br.readLine());
        int ch;
        stack stt=new stack (sz);

        do
        {
            System.out.println ("enter your choice: 1. for push, 2. for pop");
            ch=Integer.parseInt (br.readLine());

            switch (ch)
            {
                case 1:
                {
                    System.out.println ("enter element");
                    int n=Integer.parseInt (br.readLine());
                    stt.push(n);
                    break;
                }

                case 2:
                {
                    int x=stt.pop();
                    break;
                }

                default:
                {
                    System.out.println ("invalid choice");
                }
            }
        }
        while (ch<3);

        stt.display ();
    }
}