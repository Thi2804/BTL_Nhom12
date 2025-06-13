package Quanly;

import java.util.*;

public class OrderFactory {
    public void chucNang(List<Mon> menu, Map<Integer, List<Mon>> oderBan, Scanner sc) {
        System.out.println("\n===== ODER THUC UONG =====");
        System.out.println("1. Oder cho ban (dung tai quan)");
        System.out.println("2. Oder mang ve");
        System.out.print("Chon: ");
        int chon = Integer.parseInt(sc.nextLine());

        if (chon == 1) {
            System.out.print("Nhap so ban (1-10): ");
            int ban = Integer.parseInt(sc.nextLine());
            List<Mon> ds = oderBan.getOrDefault(ban, new ArrayList<>());

            while (true) {
                hienThiMenu(menu);
                System.out.print("Nhap ma mon muon oder (0 de ket thuc): ");
                int ma = Integer.parseInt(sc.nextLine());
                if (ma == 0) break;

                Mon mon = timMon(menu, ma);
                if (mon != null) {
                    System.out.print("Nhap so luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < sl; i++) ds.add(mon);
                    System.out.println("Da them vao oder cua ban " + ban);
                } else {
                    System.out.println("Khong co ma mon nay!");
                }
            }

            oderBan.put(ban, ds);
        } else if (chon == 2) {
            List<Mon> oder = new ArrayList<>();

            while (true) {
                hienThiMenu(menu);
                System.out.print("Nhap ma mon (0 de ket thuc): ");
                int ma = Integer.parseInt(sc.nextLine());
                if (ma == 0) break;

                Mon mon = timMon(menu, ma);
                if (mon != null) {
                    System.out.print("Nhap so luong: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < sl; i++) oder.add(mon);
                    System.out.println("Da them vao gio hang (mang ve)");
                } else {
                    System.out.println("Khong tim thay ma mon.");
                }
            }

            int tong = oder.stream().mapToInt(Mon::getGia).sum();
            System.out.println("Tong tien: " + tong + " VND");
        } else {
            System.out.println("Lua chon khong hop le!");
        }
    }

    private void hienThiMenu(List<Mon> menu) {
        System.out.println("===== MENU =====");
        for (Mon m : menu) {
            m.hienThi();
        }
    }

    private Mon timMon(List<Mon> menu, int ma) {
        return menu.stream().filter(m -> m.getMaMon() == ma).findFirst().orElse(null);
    }
}
