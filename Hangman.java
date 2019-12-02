import java.io.*;
public class Hangman
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = "cat bat rat sat mat mad gun fan ton fly fun nice kiss wise like love pray hiss hoof prom prop drop crop right flight write left soft deaf hard wet dry cuddle mug cup disgust attention honest loyal comfortable knife building chair table jug light plate glass phone food shoes top dress jeans charger mobile finite laptop library computer point line queue weight wait race horse round monkey donkey elephant fuse bulb tube tyre wheel seat metal bomb leather ear silence happiness child affection parents husband wife family son daughter father mother house sweet home warmth human memory ring operation kid delivery hospital food nutrition college machines gym school tution coaching dot caught cot short skirt shot thought dart pierce heart cricket music valentine hostel court indoor stadium walk campus twenty three march memorable day cherished forever missed laughter cry yell scream shout shoot boot boon economic better economy books ";
        int count=0, k=0, st=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        String arr[] = new String[count];
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                arr[k++] = s.substring(st, i);
                st=i+1;
            }
        }
        
        int r = (int)(Math.random() * count);
        
        String rnd = arr[r];
        System.out.println(rnd);
        int l = rnd.length();
        char word[] = new char[l];
        char found[] = new char[l];
        for(int i=0; i<l; i++)
        {
            found[i] = '_';
        }
        int x=0;
        while(l>0)
        {
            word[x] = rnd.charAt(x++);
            l--;
        }
        System.out.print("The word for today is : ");
        for(int i=0; i<rnd.length(); i++)
        {
            System.out.print("_ ");
        }
        System.out.println();
        int correct=0;
        int wrong=0;
        
        do
        {
           
            System.out.println();
            System.out.print("Is there a letter....");
            char c = (char)in.read();
            System.out.println();
            int flag=0;
            for(int i=0; i<rnd.length(); i++)
            {
                if(word[i]==c)
                {
                    word[i]=' ';
                    found[i]=c;
                    correct++;
                    flag=1;
                }
                
            }
            
            for(int i=0; i<rnd.length(); i++)
            {
                System.out.print(found[i]+" ");
            }
            System.out.println();
            
        }while(correct<rnd.length());
        if(correct==rnd.length())
            System.out.println("*****YOU GOT IT CORRECT*****");
    }
}
      
                