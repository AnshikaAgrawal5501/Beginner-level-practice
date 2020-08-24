import java.io.*;
public class happyno
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader (in);
        System.out.println("enter a no."); 
        int num=Integer.parseInt(br.readLine());

        int d, temp=num, sum=0;

        do
        {
            sum=0;
            while(temp!=0)
            {
                d=temp%10;
                sum=sum+d*d;
                temp=temp/10;
            }
            temp=sum;
        }
        while(sum>9);

        if (sum==1)
            System.out.println("happy no."); 
        else
            System.out.println("not a happy no."); 

    }
}
