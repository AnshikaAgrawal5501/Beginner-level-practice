import java.io.*;
class palinstring
{

    boolean palin (String s, int l)
    {
        if(l==s.length()/2)
            return true;
        else if (s.charAt(l-1)!=s.charAt(s.length()-l))
            return false;
        else
            return palin (s,l-1);
    }

    public static void main() throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter string");
        String st=br.readLine();

        palinstring ps=new palinstring ();

        boolean flag=ps.palin(st,st.length());

        if (flag==true)
            System.out.println ("palindrome");
        else 
            System.out.println ("not palindrome");
    }
}