package Quanly;

public class ChuyenKhoan implements ThanhToanStrategy {
    public void thanhToan(int tong) {
        System.out.println("Thanh toan chuyen khoan thanh cong! Tong tien: " + tong + " VND");
    }
}
