import java.io.*;
class even
{
public static void main (String args[])throws IOException
{
InputStreamReader in= new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (in);
System.out.println("Enter any no.");
int a=Integer.parseInt (br.readLine());
if (a%2==0)
System.out.println(a+"is even");
else
System.out.println(a+"is odd");
}
}
