import java.util.ArrayList;
import java.util.List;

public class FizzBuzzListGenerator {

    public static List<String> generateList(int a){
        List<String> fizzBuzzList= new ArrayList<>();
        for (int i=1;i<=a;i++){
            fizzBuzzList.add(Integer.toString(i));
        }
        return fizzBuzzList;
    }
}
