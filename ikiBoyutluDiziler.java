package JavaKursu;

public class ikiBoyutluDiziler {


    public static void main(String[] args) {
        int[][] sayilar = new int[2][3];
        sayilar[0][0] = 1;
        sayilar[0][1] = 2;
        sayilar[0][2] = 3;
        sayilar[1][0] = 4;
        sayilar[1][1] = 5;
        sayilar[1][2] = 6;
        int[][] var10000 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int satir = 0; satir < sayilar.length; ++satir) {
            for (int sutun = 0; sutun < sayilar[satir].length; ++sutun) {
                System.out.println(satir + ". satirin " + sutun + ". sütunundaki değer :" + sayilar[satir][sutun]);
            }
        }

    }
}
