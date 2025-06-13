package Quanly;

public class Mon {
    private int maMon;
    private String tenMon;
    private int gia;

    public Mon(int maMon, String tenMon, int gia) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.gia = gia;
    }

    public int getMaMon() { return maMon; }
    public String getTenMon() { return tenMon; }
    public void setTenMon(String tenMon) { this.tenMon = tenMon; }
    public int getGia() { return gia; }
    public void setGia(int gia) { this.gia = gia; }

    public void hienThi() {
        System.out.printf("%d. %s - %d VND\n", maMon, tenMon, gia);
    }

    public void hienThiChiTiet() {
        System.out.printf("Ma: %d | Ten: %-15s | Gia: %d VND\n", maMon, tenMon, gia);
    }
}