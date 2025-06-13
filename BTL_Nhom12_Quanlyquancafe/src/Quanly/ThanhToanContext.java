package Quanly;

import java.util.*;

public class ThanhToanContext {
    public void chucNang(Map<Integer, List<Mon>> oderBan, Scanner sc) {
        System.out.print("Nhap so ban can thanh toan: ");
        int ban = Integer.parseInt(sc.nextLine());
        List<Mon> ds = oderBan.get(ban);
        if (ds == null || ds.isEmpty()) {
            System.out.println("Ban nay chua oder gi ca.");
            return;
        }
        int tong = ds.stream().mapToInt(Mon::getGia).sum();
        System.out.println("Tong tien: " + tong + " VND");
        System.out.println("Chon phuong thuc thanh toan:");
        System.out.println("1. Tien mat");
        System.out.println("2. Chuyen khoan");
        System.out.print("Chon: ");
        int pt = Integer.parseInt(sc.nextLine());
        ThanhToanStrategy strategy;
        if (pt == 1) strategy = new TienMat();
        else if (pt == 2) strategy = new ChuyenKhoan();
        else {
            System.out.println("Phuong thuc khong hop le!");
            return;
        }
        strategy.thanhToan(tong);
        oderBan.remove(ban);
    }
}
