package JavaKursu;

import java.util.Scanner;

public class DiziExample {
    public static void main(String[] args) {
        int[] sayilar = new int[10];
        for (int index = 0; index < sayilar.length; index++) {
            sayilar[index] = (int) Math.pow(index, 2);
        }
        for (int index = 0; index < sayilar.length; index++) {
            System.out.println("eleman:" + sayilar[index]);
        }
        System.out.println("**************************");
        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç tane sayı kullanılsın?");
        int sayi = scan.nextInt();

        int kullaniciSayilari[] = new int[sayi];
        double ortalama = 0;
        for (int i = 0; i < sayi; i++) {
            System.out.println("sayı giriniz");
            kullaniciSayilari[i] = scan.nextInt();
            ortalama = ortalama + kullaniciSayilari[i];

        }
        System.out.println("Sayıların ortalaması :" + (ortalama / kullaniciSayilari.length));
    }


}
