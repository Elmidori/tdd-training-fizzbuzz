import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzListGeneratorTest {

    @Test
    public void FizzBuzzListReturns1IfInputIs1(){
        int a=1;

        List<String> expected = new ArrayList<String >() {{
            add("1");
        }};

        List<String> result = FizzBuzzListGenerator.generateList(a);

        Assert.assertEquals(expected, result);
    }
}
