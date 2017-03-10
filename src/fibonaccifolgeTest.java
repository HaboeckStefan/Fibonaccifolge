import org.junit.Test;

/**
 * Created by Stefan on 10.03.2017.
 */
public class fibonaccifolgeTest {
    @Test
    public void calculatefibonaccifolge() throws Exception {
        int number1 = 1;
        int number2 = 1;

        fibonaccifolge ff = new fibonaccifolge();

        ff.calculatefibonaccifolge(number1,number2);
    }

}