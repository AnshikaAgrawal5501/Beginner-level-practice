import java.io.*;
class mirrorimage
{
    public static void main () throws IOException
    {
        InputStreamReader in=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (in);

        System.out.println ("enter size of matrix");
        int m=Integer.parseInt(br.readLine());

        int a[][]=new int[m][m];

        System.out.println ("enter elements in matrix");
        for (int i=0; i<m; i++)
        {
            for (int j=0;j<m; j++)
            {
                a[i][j]=Integer.parseInt (br.readLine());
            }
        }

        System.out.println ();
        System.out.println ("original matrix is");

        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print (a[i][j]+"  ");
            }
            System.out.println ();
        }

        System.out.println ();
        System.out.println ("mirror image of matrix is");

        for (int i=0; i<m; i++)
        {
            for (int j=m-1; j>=0; j--)
            {
                System.out.print (a[i][j]+"  ");
            }
            System.out.println ();
        }
    }
}