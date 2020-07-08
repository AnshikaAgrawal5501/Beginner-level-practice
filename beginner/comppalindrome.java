import java.io.*;
class comppalindrome
{
    public static void main () throws IOException
    {

        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println("enter value of m and n");
        int m= Integer.parseInt (br.readLine());
        int n= Integer.parseInt (br.readLine());

        if(m<n)
        {
            boolean flag=false;

            for(int i=m; i<=n; i++)
            {
                for(int j=2; j<=i/2; j++)
                {
                    if (i%j==0)
                    {
                        flag=true;
                        break;   
                    }
                }
                if (flag==false)
                {
                    int temp=i, d;
                    int rev=0;

                    while(temp!=0)
                    {
                        d=temp%10;
                        rev=rev*10+d;
                        temp=temp/10;
                    }

                    if(rev==i) 
                    {
                        System.out.println(i); 
                    }
                }
                flag=false;
            }
        }

        else
        {
            System.out.println("invalid input");
        }
    }
}