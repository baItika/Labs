package lab1.com.company.Task3;

public class Task3 {
    public static void main(final String[] args) {
        final int[] arrayInt = {1, 8, 8, 7, 2};
        final char[] arraySymb = {'e', 't', 'c', 'b' , 'a', 't'};

        System.out.println(twoArraysInOneString(arrayInt, arraySymb));
    }

    public static String twoArraysInOneString(int[] arrayInt, char[] arraySymb) {
        final int theLongest;
        if (arraySymb.length >= arrayInt.length) {
            theLongest = arraySymb.length;
        } else {
            theLongest = arrayInt.length;
        }

        String result = "";
        for (int i = 0; i < theLongest; i++) {
            if (i < arrayInt.length) {
            result += arrayInt[i];
            }
            if (i < arraySymb.length) {
            result += arraySymb[i];
            }
        }
        return result;
    }
}