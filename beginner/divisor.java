import java.io.*;
class divisor
{
public static void main()throws IOException
{
int n, i;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
System.out.println("enter any no.");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
System.out.println(i);
}
}
}