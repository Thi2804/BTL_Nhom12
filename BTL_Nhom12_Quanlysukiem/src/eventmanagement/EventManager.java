package eventmanagement;

import java.util.ArrayList;

public class EventManager {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
        System.out.println("✅ Đã thêm sự kiện!");
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public boolean deleteById(String id) {
        return events.removeIf(e -> e.getId().equalsIgnoreCase(id));
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

    public boolean searchByName(String keyword) {
        boolean found = false;
        for (Event e : events) {
            if (e.getName().toLowerCase().contains(keyword.toLowerCase())) {
                e.display();
                found = true;
            }
        }
        return found;
    }
}
