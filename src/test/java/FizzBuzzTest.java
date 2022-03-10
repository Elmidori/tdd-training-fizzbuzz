import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void FizzBuzzReturns1IfInputIs1(){
        int a=1;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("1", result);
    }

    @Test
    public void FizzBuzzReturnsFizzIfInputIs4(){
        int a = 4;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("4", result);
    }

    @Test
    public void FizzBuzzReturnsFizzIfInputIs3(){
        int a = 3;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void FizzBuzzReturnsFizzIfInputIsMultipleOf3(){
        int a=9;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("Fizz", result);
    }
    @Test
    public void FizzBuzzReturnsFizzIfInputIs5(){
        int a=5;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("Buzz", result);
    }
    @Test
    public void FizzBuzzReturnsFizzIfInputIsMultipleOf5(){
        int a=25;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("Buzz", result);
    }
    @Test
    public void FizzBuzzReturnsFizzBuzzIfInputIs15(){
        int a = 15;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("FizzBuzz", result);
    }
    
    @Test
    public void FizzBuzzReturnsFizzBuzzIfInputIsMultipleOf15(){
        int a=45;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("FizzBuzz", result);
    }
}
