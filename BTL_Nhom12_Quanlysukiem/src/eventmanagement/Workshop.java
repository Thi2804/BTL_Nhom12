package eventmanagement;

public class Workshop extends Event {
    private String topic;

    public Workshop(String id, String name, String date, String location, String topic) {
        super(id, name, date, location);
        this.topic = topic;
    }

    @Override
    public void display() {
        System.out.println("Workshop - ID: " + id + ", Name: " + name + ", Date: " + date +
                ", Location: " + location + ", Topic: " + topic);
    }
}  