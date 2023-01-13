public class GugudanClass {

    public static int[] cal( int i1, int i2, int i3 ) {
        int[] resa = new int[i2];

        for(int i = 0; i <= i3;i++) {
            resa[i] = i1 * (i + 1);
        }
        return resa;
    }

    public static void print(int[] resultNum) {
        for (int i = 0; i < resultNum.length;i++) {
            System.out.println("test");
            System.out.println(resultNum[i]);
        }
    }


}
