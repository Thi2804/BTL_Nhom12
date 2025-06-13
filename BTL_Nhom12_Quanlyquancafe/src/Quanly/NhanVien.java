package Quanly;

public class NhanVien {
    private String maNV;
    private String hoTen;

    public NhanVien(String maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
    }

    public String getMaNV() { return maNV; }
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public void hienThi() {
        System.out.printf("Ma: %s - Ten: %s\n", maNV, hoTen);
    }
}
