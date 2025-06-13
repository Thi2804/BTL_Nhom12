// ========== FILE: Main.java ==========
package Quanly;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Mon> menu = new ArrayList<>();
    private static List<NhanVien> danhSachNV = new ArrayList<>();
    private static Map<Integer, List<Mon>> oderBan = new HashMap<>();
    private static int demMon = 4;

    public static void main(String[] args) {
        khoiTaoDuLieu();
        while (true) {
            System.out.println("\n===== QUAN LY QUAN CAFE =====");
            System.out.println("1. Quan ly mon");
            System.out.println("2. Quan ly nhan vien");
            System.out.println("3. Oder thuc uong");
            System.out.println("4. Thanh toan");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1 -> {
                    MonFactory factory = new MonFactory();
                    factory.chucNang(menu, sc, demMon);
                }
                case 2 -> {
                    NhanVienFactory factory = new NhanVienFactory();
                    factory.chucNang(danhSachNV, sc);
                }
                case 3 -> {
                    OrderFactory factory = new OrderFactory();
                    factory.chucNang(menu, oderBan, sc);
                }
                case 4 -> {
                    ThanhToanContext context = new ThanhToanContext();
                    context.chucNang(oderBan, sc);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Lua chon khong hop le!");
            }
        }
    }

    private static void khoiTaoDuLieu() {
        menu.add(new Mon(1, "Ca phe sua", 20000));
        menu.add(new Mon(2, "Tra dao", 25000));
        menu.add(new Mon(3, "Sinh to bo", 30000));
    }
}
