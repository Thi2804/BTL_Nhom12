package eventmanagement;

import java.util.Scanner;

public class WorkshopFactory implements EventFactory {
    @Override
    public Event createEvent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên workshop: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày: ");
        String date = sc.nextLine();
        System.out.print("Nhập địa điểm: ");
        String location = sc.nextLine();
        System.out.print("Nhập chủ đề: ");
        String topic = sc.nextLine();

        return new Workshop(id, name, date, location, topic);
    }
}