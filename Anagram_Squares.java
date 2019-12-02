import java.io.*;
public class Anagram_Squares
{
    public static void main()throws IOException
    {
        BufferedReader in - new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number N. (3<N<13) ");
        int n = Ineger.parseInt(in.readLine());
        int sm = Math.pow(10, n-1);
        int gr = Math.pow(10, n) - 1;
        int arr[] = new int[n];
        int fin[] = new int[Math.pow(10, n-1)];
        for(int i=0; i<n; i++)
        {
            arr[i] = sm%10;
            sm/=10;
        }
        if(check(arr[i]))
        {
            fin[k++] = sm;
        }
        System.out.println("All the "+n+" digited anagram squares :");
        for(int j=0; j<k; j++)
        {
            System.out.println(fin[j]);
        }
    }
    public static boolean check(int arr[])
    {
        
            
        
        