package eventmanagement;

import java.util.Scanner;

public class DeleteFunction {
    public void execute(EventManager manager) {
        Scanner sc = new Scanner(System.in);
        System.out.print("🗑️ Nhập ID sự kiện cần xóa: ");
        String id = sc.nextLine();
        boolean removed = manager.deleteById(id);
        if (removed) {
            System.out.println("🗑️ Đã xóa sự kiện có ID: " + id);
        } else {
            System.out.println("❌ Không tìm thấy sự kiện với ID: " + id);
        }
    }
}
