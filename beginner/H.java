import java.io.*;
class H
{
public static void main()throws IOException
{
int i,j;
for(i=1;i<=7;i++)
{
for(j=1;j<=5;j++)
{
if(i==4||j==1||j==5)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
