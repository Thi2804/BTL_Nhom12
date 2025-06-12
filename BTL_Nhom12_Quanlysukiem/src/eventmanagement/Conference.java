package eventmanagement;

public class Conference extends Event {
    private String speaker;

    public Conference(String id, String name, String date, String location, String speaker) {
        super(id, name, date, location);
        this.speaker = speaker;
    }

    @Override
    public void display() {
        System.out.println("Conference - ID: " + id + ", Name: " + name + ", Date: " + date +
                ", Location: " + location + ", Speaker: " + speaker);
    }
}
