package eventmanagement;

import java.util.Scanner;

public class AddEventFunction {
    public void execute(EventManager manager) {
        Scanner sc = new Scanner(System.in);
        System.out.println("➤ Chọn loại sự kiện:");
        System.out.println("1. Conference");
        System.out.println("2. Workshop");
        System.out.println("3. Training");
        System.out.println("4. Gala");
        System.out.print("Lựa chọn: ");
        int type = Integer.parseInt(sc.nextLine());

        EventFactory factory = switch (type) {
            case 1 -> new ConferenceFactory();
            case 2 -> new WorkshopFactory();
            case 3 -> new TrainingFactory();
            case 4 -> new GalaFactory();
            default -> {
                System.out.println("❌ Loại không hợp lệ.");
                yield null;
            }
        };

        if (factory != null) {
            Event event = factory.createEvent();
            manager.addEvent(event);
        }
    }
}
