import java.io.*;
class goldbach
{
public static void maain () throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("enter a no.");
int n=Integer.parseInt (br.readLine());

if (n>50 || n<9)
{
System.out.println ("no. out of range");
}

else
{

if (n%2!=0)
{
System.out.println ("no. is odd");
}

else
{
boolean flag1=false, flag2=false;
for (int i=3; i<n; i+=2)
{
 for (int j=2; j<=i/2; j++)
  {
    if (i%j==0)
     {
       flag1=true;
       break;
     }
  }
  if (flag1==false)
  {
    for (int k=3; k<n; k+=2)
     {
       for (int l=2; l<=k/2; l++)
        {
         if (k%l==0)
          {
            flag2=true;
            break;
          }
        }
       if (flag2==false)
        {
          if ((i+k)==n)
           {
            System.out.println (i+"and"+k);
           }
        }
     }
  }
 }
}
}
}
}