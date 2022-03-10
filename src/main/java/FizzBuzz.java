public class FizzBuzz {
    public static String calculate(int a){
        if(a%5==0){
            return "Buzz";
        }
        else if(a%3==0)
            return "Fizz";
        else
            return Integer.toString(a);
    }
}
