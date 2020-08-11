import java.io.*;
class factorial
{
public static void main()throws IOException
{
int n, value=1, i;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
System.out.println("enter any no.");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
value=value*i;
}
System.out.println(value);
}
}