package eventmanagement;

import java.util.Scanner;

public class SearchFunction {
    public void execute(EventManager manager) {
        Scanner sc = new Scanner(System.in);
        System.out.print("🔍 Nhập tên sự kiện cần tìm: ");
        String keyword = sc.nextLine();
        boolean found = manager.searchByName(keyword);
        if (!found) {
            System.out.println("❌ Không tìm thấy sự kiện nào.");
        }
    }
}
