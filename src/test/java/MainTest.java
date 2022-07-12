import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void nullTest(){
        FizzBuzz fb = new FizzBuzz();
        String nullStr = fb.fizzBuzzString(null);

        assertNull(nullStr);
    }
    @Test
    void startsWithF(){
        FizzBuzz fb = new FizzBuzz();
        String fStr = fb.fizzBuzzString("fire");

        assertEquals("Fizz", fStr);
    }

    @Test
    void startsWithB(){
        FizzBuzz fb = new FizzBuzz();
        String bStr = fb.fizzBuzzString("lib");

        assertEquals("Buzz", bStr);
    }

    @Test
    void startsWithFEndsWithB(){
        FizzBuzz fb = new FizzBuzz();
        String fbStr = fb.fizzBuzzString("firb");

        assertEquals("FizzBuzz", fbStr);
    }

    @Test
    void substituteElements(){
        FizzBuzz fb = new FizzBuzz();
        String[] fbArr = new String[] {"fire", "fib", "lib"};
        fb.fizzBuzzArray(fbArr);

        assertEquals("Fizz", fbArr[0]);
        assertEquals("FizzBuzz", fbArr[1]);
        assertEquals("Buzz", fbArr[2]);
    }
}