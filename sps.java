import java.io.*;
import java.math.*;
public class sps

{
    int k=0,x=0,y=0;
    int user=0, comp=0;
    int u[]=new int[100];
     int c[]=new int[100];
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        sps ob = new sps();
        System.out.println("Enter the number of rounds you want to play");
        int r=Integer.parseInt(in.readLine());
        
        while(r>0)
        {
            ob.user_inp();
            ob.comp_inp();
            ob.check();
            r--;
        }
        
        if(ob.user>ob.comp)
            System.out.println("CONGRATULATIONS!! YOU WIN!!");
        else if(ob.comp>ob.user)
            System.out.println("Oooops..!! THE COMPUTER WINS!!");
        else
            System.out.println("GAME DRAWN. PLAY AGAIN!!");
    }
    void user_inp()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the corresponding number of your choice :)");
        System.out.println("1. Stone");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        int n1 = Integer.parseInt(in.readLine());
        u[x++] = n1;
    }
    void comp_inp()
    {
        int min=1;
        int max=3;
        int r1=(int)(min+Math.random()*max);
        c[y++] = r1;
        if(r1==1)
        System.out.println("The computer entered Stone");
        else if(r1==2)
        System.out.println("The computer entered Paper");
        else
        System.out.println("The computer entered Scissor");
        
    }
    void check()
    {
        if(u[k]==1)
        {
            switch(c[k])
                {
                    case 1:
                    {
                        u[k]=9;
                        c[k]=9;
                        break;
                    }
                    case 2:
                    {
                        u[k]=0;
                        c[k]=1;
                        comp++;
                        break;
                    }
                    case 3:
                    {
                        u[k]=1;
                        c[k]=0;
                        user++;
                        break;
                    }
                }
            }
            else if(u[k]==2)
            {
                switch(c[k])
                {
                    case 1:
                    {
                        u[k]=1;
                        c[k]=0;
                        user++;
                        break;
                    }
                    case 2:
                    {
                        u[k]=9;
                        c[k]=9;
                        break;
                    }
                    case 3:
                    {
                        u[k]=0;
                        c[k]=1;
                        comp++;
                        break;
                    }
                }
            }
            else
            {
                switch(c[k])
                {
                    case 1:
                    {
                        u[k]=0;
                        c[k]=1;
                        comp++;
                        break;
                    }
                    case 2:
                    {
                        u[k]=1;
                        c[k]=0;
                        user++;
                        break;
                    }
                    case 3:
                    {
                        u[k]=9;
                        c[k]=9;
                        break;
                    }
                }
            }
            k++;
        }
    }
                    
            
            
            
    
    
            
        