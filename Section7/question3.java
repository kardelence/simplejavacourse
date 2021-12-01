package JavaKursu.Section7;

public class question3 {
    public static void main(String[] args) {
        int[] var10001 = new int[]{10, 12, 14};
        System.out.println("Topla : " + HesapMakinesi.topla(var10001));
        var10001 = new int[]{15, 4, 3};
        System.out.println("Fark : " + HesapMakinesi.cikar(var10001));
        var10001 = new int[]{10, 12, 5};
        System.out.println("Çarp : " + HesapMakinesi.carp(var10001));
        if (HesapMakinesi.bol(new int[]{0, 5, 2}) != -1.0D) {
            var10001 = new int[]{0, 5, 2};
            System.out.println("Böl : " + HesapMakinesi.bol(var10001));
        } else {
            System.out.println("Bölme işlemi başarısız");
        }
    }
}
