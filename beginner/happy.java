import java.io.*;
class happy
{
public static void main () throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("enter a no.");
int num=Integer.parseInt (br.readLine());

int temp=num, d, sum=0;
do
 {
     sum=0;
   while (temp!=0)
    {
      d=temp%10;
      temp=temp/10;
      sum=sum+d*d;
    }
   temp=sum;
 }
 while(sum>9);
}
}