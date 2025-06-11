package eventmanagement;

import java.util.Scanner;

public class ConferenceFactory implements EventFactory {
    @Override
    public Event createEvent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên hội thảo: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày: ");
        String date = sc.nextLine();
        System.out.print("Nhập địa điểm: ");
        String location = sc.nextLine();
        System.out.print("Nhập tên diễn giả: ");
        String speaker = sc.nextLine();

        return new Conference(id, name, date, location, speaker);
    }
}