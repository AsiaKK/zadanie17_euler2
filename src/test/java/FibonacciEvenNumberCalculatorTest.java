import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FibonacciEvenNumberCalculatorTest {

    FibonacciEvenNumberCalculator fibonacciEvenNumberCalculator = new FibonacciEvenNumberCalculator();

    @Test
    public void shouldReturn2WhenInputIs3() {

        // given
        int input = 3;
        double expectedResult = 2;

        // when
        double result = fibonacciEvenNumberCalculator.sumFibonacciEvenResultNumber(input);

        // then
        assertThat(result, is(expectedResult));
    }

    @Test
    public void shouldReturn10WhenInputIs6() {
        // given
        int input = 6;
        double expectedResult = 10;

        // when
        double result = fibonacciEvenNumberCalculator.sumFibonacciEvenResultNumber(input);

        // then
        assertThat(result, is(expectedResult));
    }

    @Test
    public void shouldReturn3382WhenInputIs19() {

        // given
        int input = 19;
        double expectedResult = 3382;

        // when
        double result = fibonacciEvenNumberCalculator.sumFibonacciEvenResultNumber(input);

        // then
        assertThat(result, is(expectedResult));
    }

    @Test
    public void shouldReturn1089154WhenInputIs30() {

        // given
        int input = 30;
        double expectedResult = 1089154;

        // when
        double result = fibonacciEvenNumberCalculator.sumFibonacciEvenResultNumber(input);

        // then
        assertThat(result, is(expectedResult));
    }

    @Test
    public void shouldReturn1137969253983602E209WhenInputIs1000() {

        // given
        int input = 1000;
        double expectedResult = 1.137969253983602E209;

        // when
        double result = fibonacciEvenNumberCalculator.sumFibonacciEvenResultNumber(input);

        // then
        assertThat(result, is(expectedResult));
    }

}