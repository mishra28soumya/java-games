import java.io.*;
public class file
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("word.txt");
        for(i=0; i<=50; i++)
        {
            