import java.io.*;
public class Palin
 {
     public static void main()throws IOException
     {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the number of test cases.");
         int T = Integer.parseInt(in.readLine());
         String A[] = new String[T];
         String B[] = new String[T];
         String res[] = new String[T];
         for(int i=0; i<T; i++)
         {
             System.out.println("Enter string A for test case "+(i+1)+".");
             A[i] = in.readLine();
             System.out.println("Enter string B for test case "+(i+1)+".");
             B[i] = in.readLine();
         }
         for(int i=0; i<T; i++)
         {
             String x = A[i];
             String y = B[i];
             
             int lx = x.length();
             int ly = y.length();
             
             int sx=0, sy=0, flag=0;
             for(int j=sx+1; j<lx; j++)
             {
                 String subx = x.substring(sx,j);
                 System.out.println(subx);
                 for(int k=sy+1; k<ly; k++)
                 {
                     String suby = y.substring(sy,k);
                     System.out.println(suby);
                     String add = subx+suby;
                     System.out.println("ADD = "+add);
                     if(check_palin(add))
                     {
                         flag=1;
                         res[i] = "YES";
                         break;
                     }
                 }
                 if(flag==1)
                    break;
                 sy++; 
                 if(sy==ly)
                    sx++;
             }
             
         }
         for(int i=0; i<T; i++)
         {
             if(res[i]!="YES")
                System.out.println("NO");
             else
                System.out.println(res[i]);
         }
     }
     public static boolean check_palin(String s)
     {
         String temp = "";
         int l = temp.length();
         char arr[] = new char[l];
         for(int i=l-1; i>0; i--)
         {
             arr[i] = s.charAt(i);
         }
         for(int i=0; i<l; i++)
         {
             temp = temp + arr[i];
         }
         if(temp==s)
            return true;
         else
            return false;
     }       
}
         
          
         
         
         
                     