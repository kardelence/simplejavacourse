package JavaKursu;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] sayilar = new int[]{8, 7, 2, -8, 14, 19, 11};
        int[] sayilar2 = new int[]{8, 7, 2, -8, 14, 19, 11};
        Arrays.parallelSort(sayilar);
        Arrays.parallelSort(sayilar2);
        diziYazdir(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, 11);
        System.out.println("Sonuc : " + sonuc);

        System.out.println("sayilar1 ve sayilar2 aynı mı? = " + Arrays.equals(sayilar, sayilar2));
    }

    public static void diziYazdir(int[] dizi) {
        for (int i:dizi) {
            System.out.print(i + ",");
        }
    }
}
