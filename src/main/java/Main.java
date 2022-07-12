import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // test methods here
        FizzBuzz f = new FizzBuzz();
        System.out.println(f.fizzBuzzString("fun")); // Fizz
        String[] array = new String[] {"fire", "fib", "lib", null};

        System.out.println(Arrays.toString(f.fizzBuzzArray(array)));

    }
}