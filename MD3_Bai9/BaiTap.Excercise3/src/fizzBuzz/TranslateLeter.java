package fizzBuzz;

public class TranslateLeter {
    String result;
    String firstLetter;
    String secondLetter;
    String no0 = "zero";
    String no1 = "one";
    String no2 = "two";
    String no3 = "three";
    String no4 = "four";
    String no5 = "five";
    String no6 = "six";
    String no7 = "seven";
    String no8 = "eight";
    String no9 = "nine";
    String no10 = "ten";
    String no11 = "eleven";
    String no12 = "twelve";
    String no13 = "thirteen";
    String no15 = "fifteen";
    String no20 = "twenty";
    String no30 = "thirty";
    int quotient;
    int surplus;

    @Override
    public String toString() {
        return "TranslateLeter{" +
                "result='" + result + '\'' +
                '}';
    }

    public String totranslate(int number) {
        quotient = number / 10;
        surplus = number % 10;
        if (number >= 0 && number < 100) {
            if (quotient == 0) {
                translateToLetter(number);
            } else if (quotient == 1) {
                if (surplus == 0 || surplus == 1 || surplus == 2 || surplus == 3 || surplus == 5) {
                    switch (surplus) {
                        case 0:
                            result = no10;
                            break;
                        case 1:
                            result = no11;
                            break;
                        case 2:
                            result = no12;
                            break;
                        case 3:
                            result = no13;
                            break;
                        case 5:
                            result = no15;
                            break;
                    }
                } else {
                    translateToLetter(surplus);
                    result += "teen";
                }
            } else if (quotient == 2) {
                if (surplus == 0) {
                    result = no20;
                } else {
                    result = no20 + translateToLetter(surplus);
                }
            } else if (quotient > 2 && quotient < 10) {
                if (quotient == 3) {
                    if (surplus == 0) {
                        result = no30;
                    } else {
                        firstLetter = no30;
                        secondLetter = translateToLetter(surplus);
                        result = firstLetter + secondLetter;
                    }
                } else {
                    if (quotient == 5) {
                        if (surplus == 0) {
                            result = "fifty";
                        } else {
                            firstLetter = "fifty";
                            secondLetter = translateToLetter(surplus);
                            result = firstLetter + secondLetter;
                        }
                    } else {
                        firstLetter = translateToLetter(quotient);
                        if (surplus == 0) {
                            secondLetter = "";
                        } else {
                            secondLetter = translateToLetter(surplus);
                        }
                        result = firstLetter + "ty" + secondLetter;
                    }
                }
            }

            return result;
        } else return "Please input number from 0 to 99! ";
    }

    private String translateToLetter(int number) {
        switch (number) {
            case 0:
                result = no0;
                break;
            case 1:
                result = no1;
                break;
            case 2:
                result = no2;
                break;
            case 3:
                result = no3;
                break;
            case 4:
                result = no4;
                break;
            case 5:
                result = no5;
                break;
            case 6:
                result = no6;
                break;
            case 7:
                result = no7;
                break;
            case 8:
                result = no8;
                break;
            case 9:
                result = no9;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return result;
    }
}