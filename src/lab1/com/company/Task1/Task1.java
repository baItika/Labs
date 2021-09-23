package lab1.com.company.Task1;

public class Task1 {


    static void sortArr(String []ar, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String array = ar[i];

            int j = i - 1;
            while (j >= 0 && array.length() < ar[j].length())
            {
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = array;
        }
    }

    public static void main(String args[])
    {
        final String []arr = {"aaa", "bbbb", "cc", "d", "eeeeeeee", "fff", "g", "hh", "iiiiiiiii"};
        int n = arr.length;
        sortArr(arr,n);
        for (int i=0; i<n; i++)  System.out.print(arr[i]+" ");

    }
}

