import java.io.*;
class N
{
public static void main()throws IOException
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=5;j++)
{
if(i==j||j==1||j==5)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}