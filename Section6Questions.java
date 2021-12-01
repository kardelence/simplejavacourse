package JavaKursu;

public class Section6Questions {

    //question1

   /* public static void main(String[] args) {
        int sayilar[] = new int[100];
        int tumSayilarinToplami = 0;
        for(int i=0; i<sayilar.length; i++){
            int rastgeleSayi = (int)(Math.random() * 100);
            sayilar[i] = rastgeleSayi;
            tumSayilarinToplami += rastgeleSayi;
        }
        double ortalama = (double) tumSayilarinToplami /
                (double)sayilar.length;
        int ortalamaAltindakiDegerlerinSayisi = 0;
        for (int i=0 ; i<sayilar.length; i++){
            if(sayilar[i] < ortalama){
                ortalamaAltindakiDegerlerinSayisi++;
            }
        }
        System.out.println("Ortalama : "+ortalama + " ve ortalamanın altındaki değerlerin sayısı : "+ortalamaAltindakiDegerlerinSayisi);
    } */

    //question2

    /* public static void main(String[] args) {
        int[][] matris = new int[3][2];
        int enKucukSayi=900, enBuyukSayi=0;
        for(int satir=0; satir < matris.length; satir++){
            for(int sutun=0; sutun < matris[satir].length; sutun++){
                int rastgeleSayi = (int)(Math.random() * 100);
                matris[satir][sutun] = rastgeleSayi;
                System.out.println(satir+" . satırdaki " + sutun + " . sutunun elemanı :" + matris[satir][sutun]);
                if(enKucukSayi > rastgeleSayi){
                    enKucukSayi = rastgeleSayi;
                }
                if(enBuyukSayi < rastgeleSayi){
                    enBuyukSayi=rastgeleSayi;
                }
            }
        }
        System.out.println("Bu matristeki en küçük sayı :"+enKucukSayi+" en buyuk sayı:"+enBuyukSayi);
    } */

    //question3

    public static void main(String[] args) {
        String kartTurleri[] = {"Kupa","Maça","Karo","Sinek"};
        String kartNumaralari[] = {"As" , "2", "3", "4", "5", "6", "7", "8","9" ,"10", "J","Q","K"};
        int deste[]=new int[52];
        desteyiOlustur(deste);
        desteyiKaristir(deste);
        desteyiGoster(deste, kartTurleri, kartNumaralari);
    }
    private static void desteyiKaristir(int[] deste) {
        for(int i=0; i<deste.length; i++){
            int rastgeleIndex = (int)(Math.random() * deste.length);
            int gecici = deste[i];
            deste[i] = deste[rastgeleIndex];
            deste[rastgeleIndex] = gecici;
        }
    }
    private static void desteyiGoster(int[] deste, String[] kartTurleri, String[] kartNumaralari) {
        for(int i=0; i<4 ; i++){
            String kartTuru = kartTurleri[deste[i] / 13];
            String kartNumarasi = kartNumaralari[deste[i] % 13];
            System.out.println(kartTuru + " " + kartNumarasi);
        }
    }
    private static void desteyiOlustur(int[] deste) {
        for(int i=0; i<deste.length ; i++){
            deste[i] = i ;
        }
    }
}

