package L_02;

public class House {
    private String type;
    private Bedroom room;    // Composition -> House "HAS A" room obj

    public House(String type, Bedroom room) {
        this.type = type;
        this.room = room;
    }


}
