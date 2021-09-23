package lab1.com.company.Task2;

public class Task2 {


    public static int countSymb(String string, char s)
    {
        int res = 0;
        for (int i=0; i<string.length(); i++)
        {
            if (string.charAt(i) == s)
                res++;
        }
        return res;
    }

    public static void main(String args[])
    {
        final String arr =  "monkeys like bananas" ;
        final char s = 'a';

        System.out.println (arr);
        System.out.println ( "Number of symbol "+s+": " + countSymb (arr,s)) ;
    }



}
