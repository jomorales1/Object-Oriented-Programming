package demos;

public class IntTest {
    public static void main(String[] args) {
        double[] values = {50.0, 60.0};
        System.out.println("var1: " + values[0]);
        System.out.println("var2: " + values[1]);
        SimpleLocation simpleLocation = new SimpleLocation(values[0], values[1]);
        values[0] = 15.0;
        System.out.println(simpleLocation.latitude + " " + values[0]);
    }
}
