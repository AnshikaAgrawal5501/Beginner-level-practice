import java.io.*;
class X
{
public static void main()throws IOException
{
int i,j;
for(i=1;i<=7;i++)
{
for(j=1;j<=7;j++)
{
if(i==j||i+j==8)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}