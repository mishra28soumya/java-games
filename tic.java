import java.io.*;
public class tic
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int min=0;
        int max=8;
        int sys=0;
        int user=0;
        int randomNum = min + (int)(Math.random() * max); 
        int a[]=new int[10];
        a[0]=00;
        a[1]=01;
        a[2]=02;
        a[3]=10;
        a[4]=11;
        a[5]=12;
        a[6]=20;
        a[7]=21;
        a[8]=22;
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               
                System.out.print(a[k]+" ");
                k++;
            }
            System.out.println();
        }
        //System.out.println("Enter the position where you want to enter");
        //int position=Integer.parseInt(in.readLine());
        
    }
}