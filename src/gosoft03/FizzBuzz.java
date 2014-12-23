package gosoft03;

public class FizzBuzz {

    public String count(int number) {
        String result = String.valueOf(number);
        if (isFizz(number) && isBuzz(number)) {
            result = "FizzBuzz";
        } else if (isFizz(number)) {
            result = "Fizz";
        } else if (isBuzz(number)) {
            result = "Buzz";
        }
        return result;
    }

    private boolean isBuzz(int number) {
        boolean isBuzz = number % 5 == 0;
        return isBuzz;
    }

    private boolean isFizz(int number) {
        boolean isFizz = number % 3 == 0;
        return isFizz;
    }

}
