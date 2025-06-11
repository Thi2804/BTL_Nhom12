package eventmanagement;

import java.util.ArrayList;

public class EventManager {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
        System.out.println("✅ Đã thêm sự kiện!");
    }

    public void displayAll() {
        if (events.isEmpty()) {
            System.out.println("📭 Danh sách sự kiện trống.");
        } else {
            for (Event e : events) {
                e.display();
            }
        }
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (Event e : events) {
            if (e.getName().toLowerCase().contains(keyword.toLowerCase())) {
                e.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ Không tìm thấy sự kiện nào.");
        }
    }

    public void deleteById(String id) {
        boolean removed = events.removeIf(e -> e.getId().equalsIgnoreCase(id));
        if (removed) {
            System.out.println("🗑️ Đã xóa sự kiện có ID: " + id);
        } else {
            System.out.println("❌ Không tìm thấy sự kiện với ID: " + id);
        }
    }
}