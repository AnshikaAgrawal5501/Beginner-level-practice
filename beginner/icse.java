import java.io.*;
class icse
{
public static void main()
{
String s="ICSE";
for(int i=s.length()-1;i>=0;i--)
{
for(int j=0;j<=i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}