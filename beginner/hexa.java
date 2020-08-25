import java.io.*;
class hexa
{
int n;
int a[];
int i;
hexa()
{
n=0;
int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
i=0;
}

void input() throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);

System.out.println("enter no,");
n = Integer.parseInt (br.readLine());
}

void decihexa()
{
int d=0; 
char ch;
while(n!=0)
{
d=n%16;
n=n/16;
if (d<=9)
a[i]=d;

else if (d==10)
{
ch='A';
a[i]=(int)ch;
}
else if (d==11)
{
ch='B';
a[i]=(int)ch;
}
else if (d==12)
{
ch='C';
a[i]=(int)ch;
}
else if (d==13)
{
ch='D';
a[i]=(int)ch;
}
else if (d==14)
{
ch='E';
a[i]=(int)ch;
}
else if (d==15)
{
ch='F';
a[i]=(int)ch;
}
i++;
}
System.out.print("binary no. is");
for(int j=i; j>=0; j--)
{
if (a[j]<=9)
System.out.print(a[j]);
else if(a[j]==65)
System.out.print("A");
else if(a[j]==66)
System.out.print("B");
else if(a[j]==67)
System.out.print("C");
else if(a[j]==68)
System.out.print("D");
else if(a[j]==69)
System.out.print("E");
else if(a[j]==70)
System.out.print("F");
}
}

void hexadeci()
{
double sum=0;
for(int k=0; k<=i; k++)
{
sum=sum+a[k]*Math.pow(16,k);
}
System.out.println("decimal no. is"+sum);
}

public static void main(String args[]) throws IOException
{
hexa h=new hexa();
h.input();
h.decihexa();
h.hexadeci();
}
}