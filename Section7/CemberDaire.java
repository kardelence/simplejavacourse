package JavaKursu.Section7;

public class CemberDaire {
    private int yariCap;
    public static final double PI = 3.14D;

    public CemberDaire(int r) {
        this.yariCap = r;
    }

    public double cevreBul() {
        return 6.28D * (double)this.yariCap;
    }

    public double alanBul() {
        return 3.14D * Math.pow((double)this.yariCap, 2.0D);
    }
}
