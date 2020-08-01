import java.io.*;
class E
{
public static void main()throws IOException
{
int i,j;
for(i=1;i<=7;i++)
{
for(j=1;j<=5;j++)
{
if(j==1||i==1||i==4||i==7)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}