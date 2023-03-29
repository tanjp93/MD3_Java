package Ex1;

public class NextDayCalculator {
    int day = 1;
    int month = 1;
    int year = 2023;
    String date;
    boolean isLeap = false;

    public boolean getIsLeap() {
        return isLeap;
    }

    public void setIsLeap(boolean isLeap) {
        this.isLeap = isLeap;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NextDayCalculator() {
    }

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String findNextdate() {

        this.day += 1;
        switch (this.month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (getDay() > 31) {
                    setMonth(this.month + 1);
                    setDay(1);
                }
                ;
                break;
            case 4, 6, 9, 11:
                if (getDay() > 30) {
                    setMonth(this.month + 1);
                    setDay(1);
                }
                break;
            case 2:
                if (checkLeapYear()) {
                    if (getDay() > 29) {
                        setMonth(this.month + 1);
                        setDay(1);
                        break;
                    }
                } else if (getDay() > 28) {
                    setMonth(this.month + 1);
                    setDay(1);
                    break;
                }
            default:
                throw new UnsupportedOperationException();
        }
        if (getMonth() > 12) {
            setMonth(1);
            setYear(this.year + 1);
        }
        return String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
    }

    @Override
    public String toString() {
        return "NextDayCalculator{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

    public boolean checkLeapYear() {
        if (year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if (year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if (year % 400 == 0)//chia hết cho 400 là năm nhuận
                    isLeap = true;
                else
                    isLeap = false;//không chia hết cho 400 thì không phải năm nhuận
            } else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap == true)
            System.out.println(year + " là năm nhuận.");
        else
            System.out.println(year + " không phải là năm nhuận.");
        return isLeap;
    }

}

