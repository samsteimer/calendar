import java.util.List;

public class FamilyMemeber {
    private int id;
    private String name;
    private List<Event> events;

    public FamilyMemeber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "\n Id: " + id + " -- " + name;
    }
}
