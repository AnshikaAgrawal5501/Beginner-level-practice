import java.io.*;
class mobike
{
public static void main (String args[])throws IOException
{
InputStreamReader in= new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (in);
int bno, days, charge;
String name;
System.out.println ("enter bike no.");
bno=Integer.parseInt (br.readLine());
System.out.println ("enter phone no.");
long phno=Long.parseLong (br.readLine());
System.out.println ("enter the name");
name=br.readLine();
System.out.println ("enter no. of days");
days=Integer.parseInt (br.readLine());
if (days<=5)
charge= days*500;
else if (days>5&&days<=10) 
charge= (5*500)+((days-5)*400);
else 
charge= (5*500)+(5*400)+((days-10)*200);
System.out.println ("bike no.\t phone no.\t name\t no. of days\t charge\t");
System.out.println(bno + "\t" + phno +"\t" +name+"\t"+ days +"\t"+ charge);
}
}