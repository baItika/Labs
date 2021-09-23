package lab1.com.company.Task4;

public class Task4 {
    public static void main(String[] args) {

        final String multiple3 = "Fizz";
        final String multiple5 = "Buzz";
        final int[] array = new int[100];

        for (int i = 1; i<=array.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println(multiple3 + multiple5);
            else if (i % 5 == 0)
                System.out.println(multiple5);
            else if (i % 3 == 0)
                System.out.println(multiple3);
            else System.out.println(i);
        }
    }
}

