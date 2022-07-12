import java.lang.reflect.Array;
import java.util.Locale;

public class FizzBuzz {
    public String fizzBuzzString(String str) {
        if (str == null) return null;
        if (str.toLowerCase().startsWith("f") && str.toLowerCase().endsWith("b")) return "FizzBuzz";
        if (str.toLowerCase().startsWith("f"))  return "Fizz";
        if (str.toLowerCase().endsWith("b")) return "Buzz";


        return str;
    }
    public String[] fizzBuzzArray(String[] fbArr){
        String currentElement;
        for (int i = 0; i < fbArr.length; i++){
            currentElement = fizzBuzzString(fbArr[i]);
            fbArr[i] = currentElement;
        }
        return fbArr;
    }
}