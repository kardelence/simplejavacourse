package JavaKursu.Section7;

public class HesapMakinesi {

    HesapMakinesi() {
    }

    public static int topla(int... parametreler) {
        int toplam = 0;
        int[] var2 = parametreler;
        int var3 = parametreler.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int parametre = var2[var4];
            toplam += parametre;
        }

        return toplam;
    }

    public static int cikar(int... parametreler) {
        int fark = parametreler[0];

        for(int i = 1; i < parametreler.length; ++i) {
            fark -= parametreler[i];
        }

        return fark;
    }

    public static int carp(int... parametreler) {
        int carpim = 1;
        int[] var2 = parametreler;
        int var3 = parametreler.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int parametre = var2[var4];
            carpim *= parametre;
        }

        return carpim;
    }

    public static double bol(int... parametreler) {
        int bolum = parametreler[0];

        for(int i = 1; i < parametreler.length; ++i) {
            if (parametreler[i] == 0) {
                System.out.println("parametrelerden biri 0 bölme yapılamadı");
                return -1.0D;
            }

            bolum /= parametreler[i];
        }

        return (double)bolum;
    }
}
