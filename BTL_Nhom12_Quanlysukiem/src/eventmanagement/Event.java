package eventmanagement;

public abstract class Event {
    protected String id;
    protected String name;
    protected String date;
    protected String location;

    public Event(String id, String name, String date, String location) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}
