import java.io.*;
class longestword
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader in= new InputStreamReader (System.in);
        BufferedReader br= new BufferedReader (in);
        System.out.println("enter any string");
        String s=br.readLine();
        s=s+" ";
        int cnt=0, max=0, i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                cnt++;
            else
            {
                if(cnt>=max)
                    max=cnt;
                cnt=0;
            }
        }
        System.out.println("length of longest word"+max);
    }
}