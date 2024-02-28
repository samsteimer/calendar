import java.util.List;

public class CalanderManager {
    private List<FamilyMemeber> familyMemebers;


    public void addEvent(FamilyMemeber member, Event event) {
        // add event to family member's list

    }

    public List<Event> viewEvents(String date) {
        // List events for specified day
        return null;
    }

    public List<FamilyMemeber> getFamilyMemebers() {
        return familyMemebers;
    }

    public void setFamilyMemebers(List<FamilyMemeber> familyMemebers) {
        this.familyMemebers = familyMemebers;
    }
}
