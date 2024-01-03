// A quick test to show how final works when declaring variables
// that are unable to change

public class ConstantTest {
    public static void main(String[] args) {
        final double PI = 3.14159265359;
        // PI = 3.14;
        System.out.println(PI);
    }
}