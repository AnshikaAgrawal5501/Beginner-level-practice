import java.io.*;
class binary
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter a no.");
        int n=Integer.parseInt (br.readLine());

        int a[]={0,0,0,0,0,0,0,0,0,0};

        int d, temp=n, i=0, l=a.length;
        while (temp!=0)
        {
            d=temp%2;
            temp=temp/2;
            a[l-1-i]=d;
            i++;
        }

        for (int j=0; j<l; j++)
        {
            System.out.print (a[j]);
        }
    }
}