package stremPackage;

import java.util.Scanner;

public class Calendar2 {

    // 월 별 일수 배열 선언
    public static final int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    // 윤년 계산
    public static final int[] leapDays = {31,29,31,30,31,30,31,31,30,31,30,31};

    // 해당 연도가 윤년인지 아닌지
    public static boolean isLeapYear(int year) {
        // 윤년임 아닌경우는 평년임
        if( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0) ) return true;
        return false;
    }

    public static int getMaxDaysOfMonth(int year,int month) {
        // 평년인지 윤년인지
        if( isLeapYear(year) ) {
            return leapDays[month - 1];
        } else {
            return days[month - 1];
        }
    }

    public static int stringToIntChage(String str) {
        if( str.equals("su") ) return 0;
        else if( str.equals("mo") ) return 1;
        else if( str.equals("tu") ) return 2;
        else if( str.equals("we") ) return 3;
        else if( str.equals("th") ) return 4;
        else if( str.equals("fr") ) return 5;
        else if( str.equals("sa") ) return 6;
        else return 0;
    }

    public static int getWeekDay(int year, int month, int day) {
        int syear = 1970; // 1971 , 1972, 1973
        int sweekDay = 3; // thursday -> 1970임

        int cnt = 0;

        for(int i = syear; i <= year; i++) {
            int delta = isLeapYear(i) ? 366 : 365;
            cnt += delta;
        }

        for(int i = 1; i < month; i++) {
            int delta = getMaxDaysOfMonth(year,i);
            cnt += delta;
        }

        cnt += day - 1;
        int wek = ( sweekDay + cnt)  % 7;

        return wek;
    }

    public static void print(int num,int year,int month) {
        int weekDays = getWeekDay(year,month,1);

        // 공백 만큼 반복문 실행
        for(int i = 0; i < weekDays;i++) {
            System.out.print("   ");
        }

        int cnt = 7 - weekDays;
        int maxDay = num;
        int delim = cnt < 7 ? cnt : 0;

        for(int i = 1; i <= cnt;i++) {
            System.out.printf("%3d",i);
        }
        System.out.println();
        cnt++;
        for(int i = cnt; i <= maxDay;i++) {
            System.out.printf("%3d",i);
            if(i % 7 == delim) {
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(Calendar2.getWeekDay(1973,1,1) == 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도를 입력하시죠 >>>>> ");
        int year = scanner.nextInt();

        System.out.println("월을 입력하시죠 >>>>> ");
        int month = scanner.nextInt();
        int selectMonth = getMaxDaysOfMonth(year,month);

        System.out.println("일  월  화  수  목  금  토");
        System.out.println("-----------------------");
        print(selectMonth,year,month);
        System.out.println();
        System.out.println("-----------------------");
    }
}
