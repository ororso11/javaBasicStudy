import java.util.Scanner;

class Gugudan {
    // 자바 지기 박재성 님 인프런 교육
    public static int[] cal(int times) {
        int[] res = new int[9];
        for(int i = 0; i < res.length;i++) {
            res[i] = times * ( i + 1);
        }
        return res;
    }

    public static void print(int[] res) {
        for (int i = 0; i < res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
