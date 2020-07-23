import java.io.*;
class dt
{
public static void main (String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (in);

int a[]=new int[6];

System.out.println("enter date in 6 digits");

for(int i=0; i<6; i++)
{
a[i]=Integer.parseInt (br.readLine());
}
boolean flag=false;
int mon=a[2]*10+a[3], dtt=a[0]*=a[1], yr=a[4]*10+a[5];

switch(mon)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
if(dtt>31)
System.out.println("invalid");
flag=true;
break;

case 4:
case 6:
case 9:
case 11:

if(dtt>30)
System.out.println("invalid");
flag=true;
break;

case 2:
if(yr%4==0)
{
if(dtt>29)
{
System.out.println("invalid");
flag=true;
}
}
else
{
if(dtt>28)
{
System.out.println("invalid");
flag=true;
}
}
break;


}

if(flag==false)
{ 
String aa[]={" ","January","February","March","April","May","June","July","August","September","October","November","December"};

System.out.println(dtt+" "+aa[mon]+" 20"+yr);
}


}
}