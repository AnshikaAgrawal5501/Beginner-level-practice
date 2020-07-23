import java.io.*;
class point
{
    int x, y;
    
    point ()
    {
        x=0;
        y=0;
    }
    
    void readpoint () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);
        
        System.out.println ("enter co-ordinates");
        x=Integer.parseInt (br.readLine());
        y=Integer.parseInt (br.readLine());
        System.out.println ();
    }
    
    point midpoint (point a, point b)
    {
        point m=new point ();
        m.x=(a.x+b.x)/2;
        m.y=(a.y+b.y)/2;
        
        return m;
    }
    
    void displaypoint () throws IOException
    {
        System.out.println ("mid point is :"+x+" , "+y);
    }
    
    public static void main() throws IOException
    {
        point a=new point ();
        point b=new point ();
        point c=new point ();
        
        a.readpoint ();
        b.readpoint ();
        c=c.midpoint (a, b);
        c.displaypoint ();
        
    }
}