package stremPackage;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // 입력 받은 달의 최대일수를 구해라.
        // 2월 -> 28
        // 3월 -> 31

        // 월 별 일수 배열 선언
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner scanner = new Scanner(System.in);
        int m = 0;
        while (true) {
            m = scanner.nextInt();
            System.out.println(m + "월은 " + CalendarMethod.selectDay(m,days) + "일 수 입니다.");
            if( m == 0) return;
        }
    }
}
