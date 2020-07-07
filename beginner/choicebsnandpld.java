import java.io.*;
class choicesnandpld
{
    public static void main()throws IOException
    {
        InputStreamReader in= new InputStreamReader (System.in);
        BufferedReader br= new BufferedReader (in);
        System.out.println("enter any no");
        int n=Integer.parseInt(br.readLine());
        int temp=n;
        System.out.println("enter 1 to check whether no is special no or not");
        System.out.println("enter 2 to check whether no is palindrome or not");
        int b=Integer.parseInt(br.readLine());
        switch (b)
        {
            case 1:

            int sum=0, d, f,i;
            while(n!=0)
            {
                d=n%10;
                f=1;
                for(i=1;i<=d;i++)
                {
                    f=f*i;
                }
                sum=sum+f;
                n=n/10;
            }
            if(sum==temp)
                System.out.println("sn");
            else
                System.out.println("notsn");
            break;

            case 2:

            int rev=0, di;
            while(n!=0)
            {
                di=n%10;
                rev=rev*10+di;
                n=n/10;
            }
            if(rev==temp)
                System.out.println("pld");
            else
                System.out.println("notpld");
            break;

            default:
            System.out.println("wrong choice");
            break;
        }
    }
}