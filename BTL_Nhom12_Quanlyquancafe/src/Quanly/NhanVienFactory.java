package Quanly;

import java.util.*;

public class NhanVienFactory {
    public static void chucNang(List<NhanVien> ds, Scanner sc) {
        while (true) {
            System.out.println("\n===== MENU NHAN VIEN =====");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them");
            System.out.println("3. Sua");
            System.out.println("4. Xoa");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> ds.forEach(NhanVien::hienThi);
                case 2 -> {
                    System.out.print("Nhap ma NV: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhap ten: ");
                    String ten = sc.nextLine();
                    ds.add(new NhanVien(ma, ten));
                    System.out.println("Them thanh cong!");
                }
                case 3 -> {
                    System.out.print("Nhap ma NV can sua: ");
                    String ma = sc.nextLine();
                    for (NhanVien nv : ds) {
                        if (nv.getMaNV().equals(ma)) {
                            System.out.print("Nhap ten moi: ");
                            nv.setHoTen(sc.nextLine());
                            System.out.println("Sua thanh cong!");
                            return;
                        }
                    }
                    System.out.println("Khong tim thay nhan vien!");
                }
                case 4 -> {
                    System.out.print("Nhap ma NV can xoa: ");
                    String ma = sc.nextLine();
                    ds.removeIf(nv -> nv.getMaNV().equals(ma));
                    System.out.println("Da xoa neu co.");
                }
                case 0 -> { return; }
                default -> System.out.println("Khong hop le!");
            }
        }
    }
}