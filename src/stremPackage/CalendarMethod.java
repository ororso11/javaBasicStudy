package stremPackage;

public class CalendarMethod {

    public static final String a = "";

    public static int selectDay(int m,int[] days) {
        int day = 0;
        for(int i = 0; i < days.length;i++) {
            if( ( m - 1 ) == i ) {
                day =  days[i];
            }
        }

        return day;
    }
}
