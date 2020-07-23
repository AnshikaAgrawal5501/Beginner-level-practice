import java.io.*;
class dtt
{
public static void main (String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

int a[]=new int[6];

System.out.println("enter date in 6 digits");

for(int i=0; i<6; i++)
{
a[i]=Integer.parseInt(br.readLine());
}

boolean flag=false;
String month="";
int mon=a[2]*10+a[3], dt=a[0]*10+a[1], yr=a[4]*10+a[5];

if (mon>12)
{System.out.println("invalid date");
flag=true;
}

else if (mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
{if(dt>31)
System.out.println("invalid date");
flag=true;
}

else if (mon==4||mon==6||mon==9||mon==11)
{
if (dt>30)
System.out.println("invalid date");
flag=true;
}

else if (mon==2)
{
if (yr%4==0)
{
if (dt>29)
System.out.println("invalid date");
flag=true;
}
else 
if (dt>28)
System.out.println("invalid date");
flag=true;}



if(flag==false)
{
String s[]={"","Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};

System.out.println(dt+" "+s[mon]+" 20"+yr);

}


}
}
