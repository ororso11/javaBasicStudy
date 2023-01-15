package newPackage;

public class CalendarNew {

    // 평년 월 수
    public static final int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    // 윤년 월 수
    public static final int[] leapDays = {31,29,31,30,31,30,31,31,30,31,30,31};

    // 기준 년
    private static int defaultYear = 1970;
    // 기준 월 일자
    private static int defaultDay = 3;

    public static boolean isLeapNormalYearBoolean(int year) {
        if( ( year % 4 == 0 ) && ( year % 400 != 0 || year % 100 == 0 ) ) return true;
        return false;
    }

    public static int selectIndexValue(int userYear,int userMonth) {
        if( isLeapNormalYearBoolean(userYear) ) {
            return leapDays[userMonth - 1];
        }
        return days[userMonth - 1];
    }

    public static int totalNum(int userYear,int userMonth) {
        return ( ( defaultDay + ( yearSumCalculator(userYear) + monthSumCalculator(userYear,userMonth) ) ) % 7 ) - 1;
    }

    public static int yearSumCalculator(int userYear) {
        int resSum = 0;
        for(int i = defaultYear; i <= userYear;i++) {
            resSum += isLeapNormalYearBoolean(i) ? 366 : 365;
        }
        return resSum;
    }

    public static int monthSumCalculator(int userYear,int userMonth) {
        int resSum = 0;
        for(int i = 1; i < userMonth; i++) {
            resSum += selectIndexValue(userYear,i);
        }
        return resSum;
    }
}
