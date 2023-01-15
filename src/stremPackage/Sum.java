package stremPackage;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // 입력 : 두수의 입력을 받는다.
        // 출력 : 화면에 두수의 합을 출력한다.

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println(SumMethod.sum(num1,num2));

    }
}
