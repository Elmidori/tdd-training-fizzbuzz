import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void FizzBuzzReturns1IfInputIs1(){
        int a=1;
        String result = FizzBuzz.calculate(a);

        Assert.assertEquals("1", result);
    }


}
