package eventmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        Scanner sc = new Scanner(System.in);
        int choice;

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
                case 1:
                    System.out.println("➤ Chọn loại sự kiện:");
                    System.out.println("1. Conference");
                    System.out.println("2. Workshop");
                    System.out.println("3. Training");
                    System.out.println("4. Gala");
                    System.out.print("Lựa chọn: ");
                    int type = Integer.parseInt(sc.nextLine());

                    EventFactory factory = null;
                    switch (type) {
                        case 1: factory = new ConferenceFactory(); break;
                        case 2: factory = new WorkshopFactory(); break;
                        case 3: factory = new TrainingFactory(); break;
                        case 4: factory = new GalaFactory(); break;
                        default:
                            System.out.println("❌ Loại không hợp lệ.");
                            continue;
                    }

                    Event event = factory.createEvent();
                    manager.addEvent(event);
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("🔍 Nhập tên sự kiện cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;

                case 4:
                    System.out.print("🗑️ Nhập ID sự kiện cần xóa: ");
                    String id = sc.nextLine();
                    manager.deleteById(id);
                    break;

                case 0:
                    System.out.println("👋 Tạm biệt!");
                    break;

                default:
                    System.out.println("❗ Lựa chọn không hợp lệ.");
            }

        } while (choice != 0);
    }
}