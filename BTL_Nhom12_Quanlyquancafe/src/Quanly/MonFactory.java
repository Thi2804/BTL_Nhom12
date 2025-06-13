package Quanly;

import java.util.*;

public class MonFactory {
    public static void chucNang(List<Mon> menu, Scanner sc, int demMon) {
        while (true) {
            System.out.println("\n===== MENU MON =====");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them mon");
            System.out.println("3. Sua mon");
            System.out.println("4. Xoa mon");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> menu.forEach(Mon::hienThiChiTiet);
                case 2 -> {
                    System.out.print("Nhap ten mon: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    int gia = Integer.parseInt(sc.nextLine());
                    menu.add(new Mon(demMon++, ten, gia));
                    System.out.println("Them thanh cong!");
                }
                case 3 -> {
                    menu.forEach(Mon::hienThi);
                    System.out.print("Nhap ma mon muon sua: ");
                    int ma = Integer.parseInt(sc.nextLine());
                    for (Mon m : menu) {
                        if (m.getMaMon() == ma) {
                            System.out.print("Nhap ten moi: ");
                            m.setTenMon(sc.nextLine());
                            System.out.print("Nhap gia moi: ");
                            m.setGia(Integer.parseInt(sc.nextLine()));
                            System.out.println("Da sua xong.");
                            break;
                        }
                    }
                }
                case 4 -> {
                    menu.forEach(Mon::hienThi);
                    System.out.print("Nhap ma mon muon xoa: ");
                    int ma = Integer.parseInt(sc.nextLine());
                    menu.removeIf(m -> m.getMaMon() == ma);
                    System.out.println("Da xoa neu co.");
                }
                case 0 -> { return; }
                default -> System.out.println("Khong hop le!");
            }
        }
    }
}
