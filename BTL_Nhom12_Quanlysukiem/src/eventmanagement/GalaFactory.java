package eventmanagement;

import java.util.Scanner;

public class GalaFactory implements EventFactory {
    @Override
    public Event createEvent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sự kiện gala: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày: ");
        String date = sc.nextLine();
        System.out.print("Nhập địa điểm: ");
        String location = sc.nextLine();
        System.out.print("Nhập dress code: ");
        String dressCode = sc.nextLine();

        return new Gala(id, name, date, location, dressCode);
    }
}