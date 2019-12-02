import java.io.*;
import java.math.*;
public class tic_tac_toe
{   public static char a[][] = new char[3][3];
    public static char temp[] = new char[9];
    public static void main()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\tTIC-TAC-TOE");
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j] = ' ';
            }
        }
        tic_tac_toe ob = new tic_tac_toe();
        ob.display(a);
        
        int k=0, count=0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                temp[k++] = a[i][j];
            }
        }
        
        do
        {
            System.out.println("Your turn");
            int n = Integer.parseInt(in.readLine());
            if(temp[n-1]==' ')
            {
                temp[n-1] = 'X';
                count++;
            }
            else
            {
                System.out.println("Space occupied. Re-try.");
                continue;
            }
            ob.put_array();
            ob.display(a);
            if(count<9)
            {
            System.out.println("Computer's turn");
            int s = ob.comp_input();
            if(s==1)   
                count++;
            ob.put_array();
            ob.display(a);
        }
            if(count<9)
            {
                if(ob.check()==1)
                {
                    System.out.println("You Win !!! ");
                    break;
                }
                else if(ob.check()==2)
                {
                    System.out.println("Computer Wins !!!");
                    break;
                }
                else
                
                    System.out.println("Continue playing.");  
            }
            else
            {
                if(ob.check()==1)
                {
                    System.out.println("You Win !!! ");
                    break;
                }
                else if(ob.check()==2)
                {
                    System.out.println("Computer Wins !!!");
                    break;
                }
                else
                {
                    System.out.println("*****GAME DRAWN*****");
                    break;
                }
            }
        }while(count<9);
    }
    public int comp_input()
    {
        int flag=0;
        do
        {
            
            int rnd = (int)(Math.random()*8);
            if(temp[rnd]==' ')
            {
                temp[rnd]='O';
                flag = 1;
            }
            
            
        }while(flag==0);
        return flag;
    }
    public void put_array()
    {
        int k=0;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j] = temp[k++];
            }
        }
    }
    public void display(char a[][])
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(j<2)
                    System.out.print(a[i][j]+" | ");
                else
                    System.out.println(a[i][j]);
            }
            if(i<2)    
            System.out.println("_   _   _");
        }
    }
    public int check()
    {
        int f=0;
        for(int i=0;i<3;i++)
        {
            
                if(a[i][i]=='X')
                {
                    f++;
                }
        }
        if(f==3)
        {
            
            return 1;
        }
        f=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((i+j)==2)
                {
                    if(a[i][j]=='X')
                    {
                        f++;
                    }
                }
            }
        }
        if(f==3)
        {
            f=0;
            return 1;
        }
        f=0;
        for(int i=0;i<3;i++)
        {
            f=0;
            for(int j=0; j<3; j++)
            {
                if(a[i][j]=='X')
                    f++;
                }
                if(f==3)
                    return 1;
        }
        f=0;
        for(int i=0;i<3;i++)
        {
            f=0;
            for(int j=0; j<3; j++)
            {
                if(a[j][i]=='X')
                    f++;
                }
                if(f==3)
                    return 1;
        }
        f=0;
        for(int i=0;i<3;i++)
        {
            
                if(a[i][i]=='O')
                {
                    f++;
                }
        }
        if(f==3)
        {
            f=0;
            return 2;
        }
        f=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((i+j)==2)
                {
                    if(a[i][j]=='O')
                    {
                        f++;
                    }
                }
            }
        }
        if(f==3)
        {
            f=0;
            return 2;
        }
        f=0;
        for(int i=0;i<3;i++)
        {
            f=0;
            for(int j=0; j<3; j++)
            {
                if(a[i][j]=='O')
                    f++;
                }
                if(f==3)
                    return 2;
        }
        f=0;
        for(int i=0;i<3;i++)
        {
            f=0;
            for(int j=0; j<3; j++)
            {
                if(a[j][i]=='O')
                    f++;
                }
                if(f==3)
                    return 2;
        }
           return 0;
        }
    }
        
            