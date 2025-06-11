package eventmanagement;

import java.util.Scanner;

public class TrainingFactory implements EventFactory {
    @Override
    public Event createEvent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên khóa học: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày: ");
        String date = sc.nextLine();
        System.out.print("Nhập địa điểm: ");
        String location = sc.nextLine();
        System.out.print("Nhập thời lượng (giờ): ");
        int duration = Integer.parseInt(sc.nextLine());

        return new Training(id, name, date, location, duration);
    }
}