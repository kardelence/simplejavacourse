package JavaKursu.Section7;

public class question1 {

    public static void main(String[] args) {
        CemberDaire cember1 = new CemberDaire(5);
        System.out.printf("Yarıcapı 5 olan çemberin çevresi : %.2f ", cember1.cevreBul());
        System.out.println();
        System.out.printf("Yarıcapı 5 olan dairenin alanı : %.2f ", cember1.alanBul());
    }
}
