package JavaKursu;

import java.util.Scanner;

public class MixedQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //questions1

         System.out.println("Birinci Sayıyı Giriniz");
        int BirinciSayi = scan.nextInt();
        System.out.println("ikinci Sayıyı Giriniz");
        int IkinciSayi = scan.nextInt();
        System.out.println("Birinci Sayıyı Giriniz");
        int UcuncuSayi = scan.nextInt();

        System.out.println("Girilen üç sayının ortalaması=" + ((BirinciSayi + IkinciSayi + UcuncuSayi) / 3));

        //question4

        System.out.println( "******************************");

        for(
                int i = 1;
                i<6;i++)
            System.out.println( i +".kez Kardelence");



        //question5

         System.out.println("************************");
        int toplam =0;
        System.out.println("Alt sınırı belirleyiniz");
        int altsinir =scan.nextInt();
        System.out.println("Üst sınırı belirleyiniz");
        int ustsınır =scan.nextInt();

        for(
                int j=altsinir;
                j < ustsınır; j++)
            toplam = toplam + j;
            System.out.println("Belirlediğiniz alt ve üst sınır arasında olan sayıların toplamı=" + toplam );




    }

    /*    public static void main(String[] args) {
            Scanner tara = new Scanner(System.in);
            int notDegeri = 0, notSinir=0;
            System.out.println("Notunuzu giriniz");
            notDegeri = tara.nextInt();
            notSinir = notDegeri / 10 ;
            if(notDegeri == 100){
                notSinir = 9;
            }
            switch (notSinir){
                case 9:
                    System.out.println("Notunuz AA");
                    break;
                case 8:
                    System.out.println("Notunuz BA");
                    break;
                case 7:
                    System.out.println("Notunuz BB");
                    break;
                case 6:
                    System.out.println("Notunuz CB");
                    break;
                case 5:
                    System.out.println("Notunuz CC");
                    break;
                default:
                    System.out.println("Notunuz CC'den düşük");
            }
        } */
    }




