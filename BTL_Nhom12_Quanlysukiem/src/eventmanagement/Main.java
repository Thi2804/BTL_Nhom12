package eventmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        AddEventFunction addFunc = new AddEventFunction();
        DisplayAllFunction displayFunc = new DisplayAllFunction();
        SearchFunction searchFunc = new SearchFunction();
        DeleteFunction deleteFunc = new DeleteFunction();

        do {
            System.out.println("\n🎯 QUẢN LÝ SỰ KIỆN");
            System.out.println("1. Thêm sự kiện");
            System.out.println("2. Hiển thị tất cả");
            System.out.println("3. Tìm kiếm theo tên");
            System.out.println("4. Xóa theo ID");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addFunc.execute(manager);
                case 2 -> displayFunc.execute(manager);
                case 3 -> searchFunc.execute(manager);
                case 4 -> deleteFunc.execute(manager);
                case 0 -> System.out.println("👋 Tạm biệt!");
                default -> System.out.println("❗ Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
}
