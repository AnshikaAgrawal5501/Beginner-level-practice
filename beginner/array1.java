import java.io.*;
class array1
{
    public static void main()
    {
        int a[]={4,4,4,6,7,7,7,8,9,9};
        int srch=a[0];
        int cnt=0;
        for(int i=0;i<a.length;i++)
        {
            if(srch==a[i])
                cnt++;
            else
            {
                System.out.println(srch+"found"+cnt+"times");
                srch=a[i];
                cnt=1;
            }
        }
        System.out.println(srch+"found"+cnt+"times");
    }
}