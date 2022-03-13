import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzListGeneratorTest {

    @Test
    public void FizzBuzzListReturns1IfInputIs1(){
        int a=1;

        List<String> expected = new ArrayList<String>(){{
            add("1");
        }};

        List<String> result = FizzBuzzListGenerator.generateList(a);

        Assert.assertEquals(expected, result);
    }


    @Test
    public void FizzBuzzListReturns1_2IfInputIs2(){
        int a=2;

        List<String> expected = new ArrayList<String >() {{
            add("1");add("2");
        }};

        List<String> result = FizzBuzzListGenerator.generateList(a);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void FizzBuzzListReturns1_2_FizzIfInputIs3(){
        int a=3;

        List<String> expected = new ArrayList<String >() {{
            add("1");add("2");add("Fizz");
        }};

        List<String> result = FizzBuzzListGenerator.generateList(a);

        Assert.assertEquals(expected, result);
    }

    
    @Test
    public void FizzBuzzListReturns1_2_Fizz_4_BuzzIfInputIs5(){
        int a=5;

        List<String> expected = new ArrayList<String >() {{
            add("1");add("2");add("Fizz");add("4");add("Buzz");
        }};

        List<String> result = FizzBuzzListGenerator.generateList(a);

        Assert.assertEquals(expected, result);
    }

}
