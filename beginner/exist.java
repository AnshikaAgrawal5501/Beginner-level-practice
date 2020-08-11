import java.io.*;
class exist
{
public static void main (String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

System.out.println ("enter range of array");
int n=Integer.parseInt(br.readLine());

int a[]=new int[n];

System.out.println ("enter elements in array");
for(int i=0; i<n; i++)
{
a[i] =Integer.parseInt(br.readLine());
}

for(int i=0; i<n; i++)
{
System.out.println(a[i]);
}
}
}