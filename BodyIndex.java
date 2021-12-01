package JavaKursu;

import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("boy giriniz:");
        double boy = scan.nextDouble();

        System.out.println("kilo giriniz:");
        double kilo = scan.nextDouble();

        double boyut;
        boyut = (double) boy/(100);
        double endeks;
        endeks = ((double)kilo / Math.pow(boyut,2));
        System.out.println("Vücut kitle Endeksi="+ endeks);

        if (endeks< 15){
            System.out.println("çok ciddi derecede düşük kilolu! kilo alınız.");
        }else if (endeks >15 && endeks < 16){
            System.out.println("ciddi derecede düşük kilolu. kilo alınız.");
        }else if(endeks >16 && endeks <18){
            System.out.println("düşük kilolu. birazcık kilo alınız.");
        }else if (endeks>18 && endeks<25){
            System.out.println("Sağlıklı kilodasınız :)");
        }else if (endeks >25 && endeks>30){
            System.out.println("Fazla Kilolu. Kilo veriniz.");
        }else if (endeks >30 && endeks>35) {
            System.out.println("birinci dereceden obez. Kilo veriniz.");
        }
    }
}
