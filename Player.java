package tagver3;

/**
 *
 * @author Zack
 */
public class Player {

    String name;
    int health;
    private Room location;
    private int roomNr;
    private int playerGold;
    Boundery b = new Boundery();

    public Player(String name, int health, Room location, int roomNr, int playerGold) {
        this.name = b.named;
        this.health = health;
        this.location = location;
        this.roomNr = roomNr;
        this.playerGold = playerGold;
    }

    Player() {

    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "" + name + "";
    }

    public void setName(String name) {
        this.name = name;
        name= b.named;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public Room getLocation() {
        return location;
    }

}
