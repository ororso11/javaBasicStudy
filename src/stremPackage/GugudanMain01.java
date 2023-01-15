package stremPackage;

import java.util.Scanner;

public class GugudanMain01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.next().split(",");
        int num1 = Integer.parseInt(inputString[0]);
        int num2 = Integer.parseInt(inputString[1]);

        for(int i = 2; i <= num1; i++) {
            int[] res = GugudanClass.cal(i,num1,num2);
            GugudanClass.print(res);
        }

    }
}
