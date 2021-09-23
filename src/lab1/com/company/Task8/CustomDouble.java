package lab1.com.company.Task8;

import java.util.Objects;

public class CustomDouble {

    private int first;
    private double second;

    public CustomDouble(int first, double second) {
        this.first = first;
        this.second = second;
    }

    public CustomDouble(double number) {
        this.first = (int) number;
        this.second = number - first;
    }

    public CustomDouble addition(CustomDouble customDouble) {
        double result = this.toDouble() + customDouble.toDouble();

        return new CustomDouble(result);
    }

    public CustomDouble subtraction(CustomDouble second) {
        double result = this.toDouble() - second.toDouble();

        return new CustomDouble(result);
    }

    public void comparison(CustomDouble customDouble) {
        double result = this.toDouble() - customDouble.toDouble();

        if(result > 0){
            System.out.println("First > second");
        }else if (result == 0){
            System.out.println("Second = first");
        }else{
            System.out.println("Second > first");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDouble that = (CustomDouble) o;
        return first == that.first && Double.compare(that.second, second) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public double toDouble() {
        return (double) this.first + this.second;
    }

    @Override
    public String toString() {
        return this.toDouble() + "";
    }

    public static void main(String[] args) throws Exception {
        CustomDouble customDouble1 = new CustomDouble (1, 3.4);
        CustomDouble customDouble2 = new CustomDouble (-2, 5.3);

        System.out.println ("figure 1: " +customDouble1);
        System.out.println ("figure 2: " +customDouble2);
        System.out.println ("sum: "+customDouble1.addition(customDouble2));
        System.out.println ("sub: "+customDouble1.subtraction(customDouble2));
        customDouble1.comparison (customDouble2);
        System.out.println (customDouble1.equals (customDouble2));
        System.out.println (customDouble2.hashCode ());
    }
}
