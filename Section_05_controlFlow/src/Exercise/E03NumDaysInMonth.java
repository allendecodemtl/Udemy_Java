package Exercise;

public class E03NumDaysInMonth {
    public static void main(String[] args) {
        int res;

        res = getDaysInMonth(1, 2020);
        // return 31 since January has 31 days.
        System.out.println(res);

        res = getDaysInMonth(2, 2020);
        // return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(res);

        res = getDaysInMonth(2, 2018);
        // return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(res);

        res = getDaysInMonth(-1, 2020);
        // return -1 since the parameter month is invalid.
        System.out.println(res);

        res = getDaysInMonth(1, -2020);
        // return -1 since the parameter year is outside the range of 1 to 9999.
        System.out.println(res);



    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {

        if(year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }


}
