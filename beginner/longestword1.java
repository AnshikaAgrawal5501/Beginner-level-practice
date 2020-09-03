import java.io.*;
class longestword1
{
public static void main(String args[])throws IOException
{
InputStreamReader in= new InputStreamReader (System.in);
BufferedReader br= new BufferedReader (in);
System.out.println("enter any string");
String s=br.readLine();
s=s+" ";
String n="", l="";
int k=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
n=s.substring(k,i);
k=i+1;
if(n.length()>l.length())
l=n;
n="";
}
}
System.out.println("longest word"+l);
}
}