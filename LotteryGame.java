package JavaKursu;

import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi = (int) Math.random() * 99 + 1;
        System.out.println("0 ile 100 arasında bir sayı tahmin ediniz");
        int TahminEdilenSayi = scan.nextInt();

        int SayininBirinciBasamak = sayi / 10;
        int SayininİkinciBasamak = sayi % 10;

        int TahminEdilenSayınınBirinciBasamak = TahminEdilenSayi / 10;
        int TahminEdilenSayınınİkinciBasamak = TahminEdilenSayi % 10;

        if(sayi== TahminEdilenSayi){
            System.out.println("tebrikler");
        }else if (SayininBirinciBasamak == TahminEdilenSayınınİkinciBasamak && SayininİkinciBasamak == TahminEdilenSayınınBirinciBasamak){
            System.out.println("değişik bir tahmin, sayıları yer değiştirseydiniz keşke");
        }else {
            System.out.println("Bilemediniz.");
        }
    }


}
