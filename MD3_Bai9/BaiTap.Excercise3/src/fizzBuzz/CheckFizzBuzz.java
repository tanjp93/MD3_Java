package fizzBuzz;

public class CheckFizzBuzz {
    String fizzBuzz;

    public static String isFizzBuzz(int number) {
        String numberTypeSt = String.valueOf(number);
        String result = "";
        if (number > 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                return result="Fizz Buzz";
            } else if (number % 3 == 0) {
                return result="Fizz";
            } else if (number % 5 == 0) {
                return result="Buzz";
            } else findThreeFive(number);
            ;
        } else {
            return result= "Your input number is not positive integer ";
        }
        return result;
    }

    public static String findThreeFive(int number) {
        char three = '3';
        char five = '5';
        boolean isFizz = false;
        boolean isBuzz = false;
        String result = "";

        String numberTypeSt = String.valueOf(number);
        for (int i = 0; i < numberTypeSt.length(); i++) {
            if (three == numberTypeSt.charAt(i)) {
                isFizz = true;
                break;
            } else isFizz = false;
        }
        for (int i = 0; i < numberTypeSt.length(); i++) {
            if (five == numberTypeSt.charAt(i)) {
                isBuzz = true;
                break;
            } else isBuzz = false;
        }
        if (isFizz && isBuzz) {
            return result = "Fizz Buzz";
        } else if (isFizz && !isBuzz) {
            return result = "Fizz ";
        } else if (!isFizz && isBuzz) {
            return result = "Buzz";
        } else return result = "Your input number is regular number !";
    }
}
