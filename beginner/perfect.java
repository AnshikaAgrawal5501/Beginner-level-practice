import java.io.*;
class perfect
{
public static void main()throws IOException
{
int n,count=0, i;
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
System.out.println("enter any no.");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
count+=i;
}
if(count==n)
System.out.println("perfect no.");
else
System.out.println("not perfect no.");
}
}