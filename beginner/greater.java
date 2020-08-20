import java.io.*;
class greater
{
public static void main (String args[])throws IOException
{
InputStreamReader in= new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (in);
System.out.println ("Enter first no.");
int a=Integer.parseInt (br.readLine());
System.out.println ("Enter second no.");
int b=Integer.parseInt (br.readLine());
System.out.println ("Enter third no.");
int c=Integer.parseInt (br.readLine());
if (a>b&&a>c)
System.out.println (a+"is greatest");
else if (b>a&&b>c)
System.out.println (b+"is greatest");
else
System.out.println (c+"is greatest");
}
}