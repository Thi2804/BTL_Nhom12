package eventmanagement;

public class Gala extends Event {
    private String dressCode;

    public Gala(String id, String name, String date, String location, String dressCode) {
        super(id, name, date, location);
        this.dressCode = dressCode;
    }

    @Override
    public void display() {
        System.out.println("Gala - ID: " + id + ", Name: " + name + ", Date: " + date +
                ", Location: " + location + ", Dress Code: " + dressCode);
    }
}