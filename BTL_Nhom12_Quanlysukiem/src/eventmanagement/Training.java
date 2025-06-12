package eventmanagement;

public class Training extends Event {
    private int durationHours;

    public Training(String id, String name, String date, String location, int durationHours) {
        super(id, name, date, location);
        this.durationHours = durationHours;
    }

    @Override
    public void display() {
        System.out.println("Training - ID: " + id + ", Name: " + name + ", Date: " + date +
                ", Location: " + location + ", Duration: " + durationHours + " hours");
    }
}